package es.curso.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import es.curso.modelo.entidad.Usuario;

public class DaoUsuario {
	
	public DaoUsuario() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Usuario> lista(){
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		Usuario u= new Usuario();
		listaUsuarios.add(u);
		return listaUsuarios;
	}
	
	public Usuario obtener(String usuario, String contrasena) {
		if (usuario.equals("dani")) {
			if(contrasena.equals("root")) {
				Usuario u = new Usuario();
				return u;
			}
			return null;
		} else {
			return null;
		}
	}

}
