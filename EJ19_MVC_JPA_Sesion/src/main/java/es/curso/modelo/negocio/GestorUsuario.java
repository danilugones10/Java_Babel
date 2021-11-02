package es.curso.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.persistencia.DaoUsu;

@Service
public class GestorUsuario {

	@Autowired
	private DaoUsu daoUsuario;
	
	public boolean validarUsuario(String usuario, String contrasena) {
		Optional<Usuario> u = daoUsuario.findByUsuario(usuario);		
		return u.isPresent() ? true : false;
	}
}
