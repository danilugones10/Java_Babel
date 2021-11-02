package es.curso.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.persistencia.DaoUsuario;

@Service
public class GestorUsuario {
	
	@Autowired
	public DaoUsuario daoUsuario;
	
	public boolean validarUsuario(String username, String password) {
		Optional<Usuario> usuario = daoUsuario.findByUsuario(username);		
		return usuario.isPresent() ? true : false;
	}
	

}
