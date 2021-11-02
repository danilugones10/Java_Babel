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
public class ControladorUsuarios {
	
	@Autowired
	private GestorUsuario daoUsuario;
	
	@Autowired
	private Usuario u;

	@RequestMapping(value="validar",method=RequestMethod.POST)
	public String validar(
			@RequestParam("usuario") String usuario,
			@RequestParam("contrasena") String contrasena,
			Model model){		

		boolean estaValidado = daoUsuario.validarUsuario(usuario, contrasena);
		if(estaValidado==true) {
			u.setUsuario(usuario);
			return "redirect:/mvc/verListado";
		}else {
			String error = "Usuario con nombre: " + usuario +
					" y password " + contrasena + " no existe";
			model.addAttribute("error",error);
			return "redirect:/index.jsp";
		}
	}
}
