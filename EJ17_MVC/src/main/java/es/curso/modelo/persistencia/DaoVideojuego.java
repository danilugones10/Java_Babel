package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import es.curso.modelo.entidad.Videojuego;

public class DaoVideojuego {

	public DaoVideojuego() {

	}
	List<Videojuego> listaVideojuego = new ArrayList<Videojuego>();
	
	public List<Videojuego> listar() {

		Videojuego p = new Videojuego();
		p.setId(1);
		p.setNombre("Fornite");
		p.setCompania("EpicGames");
		p.setNotaMedia(8);

		listaVideojuego.add(p);

		p = new Videojuego();
		p.setId(2);
		p.setNombre("GTAV");
		p.setCompania("Rockstar");
		p.setNotaMedia(9);

		listaVideojuego.add(p);
		
		p = new Videojuego();
		p.setId(3);
		p.setNombre("Warzone");
		p.setCompania("Rockstar");
		p.setNotaMedia(10);

		listaVideojuego.add(p);

		return listaVideojuego;
	}

	public Videojuego obtener(int id) {
			listar();
			if(listaVideojuego.size()>=id) {
				return listaVideojuego.get(id-1);
			}
			else {
				return null;
			}
			
	}
	
}
