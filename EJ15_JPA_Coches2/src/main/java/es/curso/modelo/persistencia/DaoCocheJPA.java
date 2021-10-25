package es.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Coche;


@Repository
public interface DaoCocheJPA extends JpaRepository<Coche, Integer>{
	
}
