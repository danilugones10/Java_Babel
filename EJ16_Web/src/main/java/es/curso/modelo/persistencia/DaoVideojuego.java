package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import es.curso.modelo.entidad.Videojuego;

public class DaoVideojuego {

	public DaoVideojuego() {

	}

	public List<Videojuego> listar() {
		List<Videojuego> listaVideojuego = new ArrayList<Videojuego>();

		Videojuego p = new Videojuego();
		p.setId(1);
		p.setNombre("Fornite");
		p.setCompañia("EpicGames");
		p.setNotaMedia(8);

		listaVideojuego.add(p);

		p = new Videojuego();
		p.setId(2);
		p.setNombre("GTAV");
		p.setCompañia("Rockstar");
		p.setNotaMedia(9);

		listaVideojuego.add(p);
		
		p = new Videojuego();
		p.setId(3);
		p.setNombre("Warzone");
		p.setCompañia("Rockstar");
		p.setNotaMedia(10);

		listaVideojuego.add(p);

		return listaVideojuego;
	}

	public Videojuego obtener(int id) {

		if (id == 1) {
			Videojuego p = new Videojuego();
			p.setId(1);
			p.setNombre("Fornite");
			p.setCompañia("EpicGames");
			p.setNotaMedia(8);
			p.setCreador("Daniel");
			p.setWeb("https://www.epicgames.com/fortnite/es-ES/home");
			return p;
		} else if (id == 2) {
			Videojuego p = new Videojuego();
			p.setId(2);
			p.setNombre("GTAV");
			p.setCompañia("Rockstar");
			p.setNotaMedia(9);
			p.setCreador("Pelayo");
			p.setWeb("https://www.rockstargames.com/V/restricted-content/agegate/form?redirect=https%3A%2F%2Fwww.rockstargames.com%2FV%2F&options=&locale=en_us");
			return p;
		}
		else if (id == 3) {
			Videojuego p = new Videojuego();
			p.setId(3);
			p.setNombre("Warzone");
			p.setCompañia("Rockstar");
			p.setCreador("Ana");
			p.setNotaMedia(10);
			p.setWeb("https://www.callofduty.com/es/warzone");
			return p;
		}else {
			return null;
		}
	}
	
}
