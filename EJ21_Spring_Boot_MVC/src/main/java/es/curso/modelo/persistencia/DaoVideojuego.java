package es.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.modelo.entidad.Videojuego;

public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{

	
	
}
