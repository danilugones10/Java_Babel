package es.curso.modelo.negocio;

import java.util.List;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.persistencia.DaoUsuario;

public class GestorUsuario {
	
	public DaoUsuario daoUsuario;
	
	public List<Usuario> listar(){
		daoUsuario = new DaoUsuario();
		return daoUsuario.lista();
	}
	
	public Usuario obtener(String usuario, String contrasena) {
		daoUsuario=new DaoUsuario();
		return daoUsuario.obtener(usuario, contrasena);
	}

}
