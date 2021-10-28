package es.curso.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.curso.modelo.entidad.Usuario;

@Repository
public interface DaoUsu extends JpaRepository<Usuario, Integer>{
	
	public List<Usuario> findByUsuario(String usuario);

}
