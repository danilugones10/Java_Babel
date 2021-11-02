package es.curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorVideojuego;

@Controller
public class VideojuegoControlador {

	@Autowired
	private GestorVideojuego gestorVideojuego;

	@Autowired
	private Usuario usuario;

	@RequestMapping("videojuegos/verListado")
	public ModelAndView listado() {
		if (usuario.getUsuario() == null) {
			ModelAndView mav = new ModelAndView("redirect:/index.jsp");
			return mav;
		}
		List<Videojuego> listaPeliculas = gestorVideojuego.listar();
		ModelAndView mav = new ModelAndView("listadoVideojuegos");
		mav.addObject("listaVideojuegos", listaPeliculas);
		mav.addObject("usuario", usuario);
		return mav;
	}

	@RequestMapping("videojuegos/verFormulario")
	public ModelAndView formulario() {
		ModelAndView mav = new ModelAndView("formularioPeliculas");
		mav.addObject("videojuego", new Videojuego());
		return mav;
	}

	@RequestMapping(value = "videojuegos/insertar", method = RequestMethod.POST)
	public ModelAndView insertar(@ModelAttribute Videojuego videojuego, Model model) {
		gestorVideojuego.insertar(videojuego);
		ModelAndView mav = new ModelAndView("redirect:/videojuegos/verListado");
		return mav;
	}

	@RequestMapping(value = "videojuegos/modificar", method = RequestMethod.POST)
	public ModelAndView modificar(@ModelAttribute Videojuego videojuego) {
		gestorVideojuego.modificar(videojuego);
		ModelAndView mav = new ModelAndView("redirect:/videojuegos/verListado");
		return mav;
	}

	@RequestMapping(value = "videojuegos/borrar", method = RequestMethod.POST)
	public ModelAndView borrar(@ModelAttribute Videojuego videojuego) {
		System.out.println(videojuego.getId());
		gestorVideojuego.borrar(videojuego.getId());
		ModelAndView mav = new ModelAndView("redirect:/videojuegos/verListado");
		return mav;
	}
}
