package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {

	private DaoVideojuego daoVideojuego;
	
	public List<Videojuego> listar(){
		daoVideojuego = new DaoVideojuego();
		return daoVideojuego.listar();
	}
	
	public Videojuego obtener(int id) {
		daoVideojuego=new DaoVideojuego();
		return daoVideojuego.obtener(id);
	}
}
