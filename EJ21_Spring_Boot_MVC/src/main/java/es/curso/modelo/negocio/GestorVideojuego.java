package es.curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.persistencia.DaoVideojuego;

@Service
public class GestorVideojuego {

	@Autowired
	private DaoVideojuego daoVideojuego;
	
	@Transactional
	public int insertar(Videojuego p) {
		return daoVideojuego.save(p).getId();
	}
	
	@Transactional
	public Videojuego modificar(Videojuego p) {
		return daoVideojuego.save(p);
	}
	
	@Transactional
	public int borrar(int id) {
		daoVideojuego.deleteById(id);
		return id;
	}
	
	public Videojuego buscar(int id) {
		return daoVideojuego.findById(id).orElse(null);
	}
	
	public List<Videojuego> listar() {
		return daoVideojuego.findAll();
	}
}
