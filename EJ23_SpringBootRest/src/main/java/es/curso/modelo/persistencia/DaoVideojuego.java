package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import es.curso.modelo.entidad.Videojuego;

@Component
public class DaoVideojuego {

	public List<Videojuego> listVideojuegos;
	public int contador;
	
	public DaoVideojuego() {
		listVideojuegos = new ArrayList<Videojuego>();
		System.out.println("DaoPersona -> Creando la lista de personas!");
		Videojuego v1 = new Videojuego(contador++, "Fifa", "EA", 9, 20 );
		Videojuego v2 = new Videojuego(contador++, "Fornite", "Epic Games", 7, 20 );
		Videojuego v3 = new Videojuego(contador++, "GTA", "Rockstar", 9, 20 );
		
		listVideojuegos.add(v1);
		listVideojuegos.add(v2);
		listVideojuegos.add(v3);
	}
	
	public Videojuego get(int posicion) {
		try {
			return listVideojuegos.get(posicion);
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("Videojuego fuera de rango");
			return null;
		}
	}
	
	public List<Videojuego> list() {
		return listVideojuegos;
	}
	
	public List<Integer> total() {
		int total=0;
		List<Integer>lista = new ArrayList<Integer>();
		for (Videojuego videojuego : listVideojuegos) {
			lista.add(videojuego.getPrecio());
			total+=videojuego.getPrecio();
		}
		lista.add(total);
		return lista;
	}
	
	public void add(Videojuego p) {
		p.setId(contador++);
		listVideojuegos.add(p);
	}
	
	public Videojuego delete(int posicion) {
		try {
			return listVideojuegos.remove(posicion);
		} catch (Exception e) {
			System.out.println("delete -> Videojuego fuera de rango");
			return null;
		}
	}
	
	public Videojuego update(Videojuego p) {
		try {
			Videojuego pAux = listVideojuegos.get(p.getId());
			if(pAux != null) {
				pAux.setNombre(p.getNombre());
				pAux.setCompania(p.getCompania());
				pAux.setNotaMedia(p.getNotaMedia());
				pAux.setPrecio(p.getPrecio());
			}
			return pAux;
		} catch (IndexOutOfBoundsException iobe) {
			System.out.println("update -> Videojuego fuera de rango");
			return null;
		}
	}
	
	public List<Videojuego> listByNombre(String nombre){
		List<Videojuego> listaPersonasAux = new ArrayList<Videojuego>();
		for (Videojuego videojuego : listVideojuegos) {
			if(videojuego.getNombre().equalsIgnoreCase(nombre)) {
				listaPersonasAux.add(videojuego);
			}
		}
		return listaPersonasAux;
	}
	
	public List<Videojuego> listByCompania(String compania){
		List<Videojuego> listaPersonasAux = new ArrayList<Videojuego>();
		for (Videojuego videojuego : listVideojuegos) {
			if(videojuego.getCompania().equalsIgnoreCase(compania)) {
				listaPersonasAux.add(videojuego);
			}
		}
		return listaPersonasAux;
	}
}
