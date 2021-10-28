package es.curso.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.modelo.entidad.Usuario;

public interface DaoUsu extends JpaRepository<Usuario, Integer>{

	public static Usuario obtener(String usuario, String contrasena) {
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
