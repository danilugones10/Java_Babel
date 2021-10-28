package es.curso.controlador;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorUsuario;
import es.curso.modelo.negocio.GestorVideojuego;

@Controller
public class Controlador {
	
	@Autowired
	private GestorUsuario gestorUsuario;
	
	@Autowired
	private GestorVideojuego gestorVideojuego;
	
	@GetMapping("login")
	public String getLogin() {
		return "loginSaludo";
	}

	@PostMapping("login")
	public String login(@RequestParam("usuario") String username, @RequestParam("pass") String password,HttpServletRequest request) {
		
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("pass");
		Usuario u = gestorUsuario.obtener(usuario, contraseña);
		
		List<Videojuego> listaVideojuego = gestorVideojuego.listar();
		
		request.setAttribute("lista", listaVideojuego);
		
		if (u != null) {
			return "listadoVideojuegos";
		} else {
			return "error";
		}

	}
	
	@PostMapping("juego")
	public String videojuego(@RequestParam("id") String id,HttpServletRequest request) {
		
		String idd = id;
		int id2=Integer.parseInt(idd);
		
		Videojuego v=gestorVideojuego.obtener(id2);
		
		if(v != null) {
			request.setAttribute("v", v);
			return "videojuego";
		}else {
			return "error";
		}

	}
	
}
