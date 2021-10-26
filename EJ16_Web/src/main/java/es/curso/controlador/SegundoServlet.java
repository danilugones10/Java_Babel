package es.curso.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Usuario;
import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorUsuario;
import es.curso.modelo.negocio.GestorVideojuego;

/**
 * Servlet implementation class SegundoServlet
 */
@WebServlet("/SegundoServlet")
public class SegundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SegundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorUsuario gp = new GestorUsuario();
		
		String usuario = request.getParameter("usuario");
		String contraseña = request.getParameter("pass");
		Usuario u = gp.obtener(usuario, contraseña);
		
		GestorVideojuego gv = new GestorVideojuego();
		
		List<Videojuego> listaVideojuego = gv.listar();
		
		request.setAttribute("lista", listaVideojuego);
		
		if(u != null) {
			request.setAttribute("u", u);
					
			request.getRequestDispatcher("listadoVideojuegos.jsp").forward(request, response);	
		}else {
			request.getRequestDispatcher("error.jsp").forward(request, response);	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
