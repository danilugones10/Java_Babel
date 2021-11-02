package es.curso.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.negocio.GestorUsuario;

@Controller
public class UsuarioControlador {

	@Autowired
	private GestorUsuario gestorUsuario;
	
	@Autowired
	private Usuario usuario;
	
	@RequestMapping(value="validar",method=RequestMethod.POST)
	public String validar(
			@RequestParam("usuario") String nombre,
			@RequestParam("contrasena") String pass,
			Model model){		

		boolean estaValidado = gestorUsuario.validarUsuario(nombre,pass);
		if(estaValidado) {
			usuario.setUsuario(nombre);
			return "redirect:/videojuegos/verListado";
		}else {
			String error = "Usuario con nombre: " + nombre +
					" y password " + pass + " no existe";
			model.addAttribute("error",error);
			return "redirect:/index.jsp";
		}
	}
}