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
import es.curso.modelo.persistencia.DaoUsu;
import es.curso.modelo.persistencia.DaoVideo;

@Controller
public class Controlador {

	@Autowired
	DaoUsu gUsuario;
	@Autowired
	DaoVideo gVideojuego;
	
	@GetMapping("login")
	public String getLogin() {
		return "loginSaludo";
	}

	@PostMapping("login")
	public String login(@RequestParam("usuario") String username, @RequestParam("pass") String password,HttpServletRequest request) {
		
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("pass");
		Usuario u = DaoUsu.obtener(usuario, contraseña);
		
		System.out.println(gUsuario.findById(u.getId()));
		
		List<Videojuego> listaVideojuego = gVideojuego.findAll();		
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
		
		if(gVideojuego.findById(id2).isEmpty() != true) {
			request.setAttribute("v", gVideojuego.findById(id2).get());
			return "videojuego";
		}else {
			return "error";
		}

	}
	
}
