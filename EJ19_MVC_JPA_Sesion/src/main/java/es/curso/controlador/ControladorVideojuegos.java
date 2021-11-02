package es.curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorVideojuego;

@Controller
public class ControladorVideojuegos {

	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@Autowired
	private Usuario usuario;
	
	@RequestMapping("verListado")
	public ModelAndView listado() {
		if(usuario.getUsuario() == null) {
			ModelAndView mav = new ModelAndView("redirect:/index.jsp");
			return mav;
			
		}
		List<Videojuego> lisatdoVideojuegos = gestorVideojuego.listar();
		ModelAndView mav = new ModelAndView("listadoVideojuegos");
		mav.addObject("listadoVideojuegos",lisatdoVideojuegos);
		mav.addObject("usuario",usuario);
		return mav;
	}
}
