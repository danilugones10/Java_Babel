package es.curso.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.modelo.entidad.Usuario;

public interface DaoUsu extends JpaRepository<Usuario, Integer>{
	
	public Optional<Usuario> findByUsuario(String usuario);

}
