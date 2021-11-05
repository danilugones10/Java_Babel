package es.curso.modelo.persistencia;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import es.curso.modelo.entidad.Videojuego;

@Repository
public interface DaoVideojuego extends MongoRepository<Videojuego, Integer>{
	
}
