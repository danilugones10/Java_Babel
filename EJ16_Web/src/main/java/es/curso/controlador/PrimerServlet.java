package es.curso.controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import es.curso.modelo.entidad.Videojuego;
import es.curso.modelo.negocio.GestorVideojuego;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestorVideojuego gp = new GestorVideojuego();
		
		String idd = request.getParameter("id");
		int id=Integer.parseInt(idd);
		
		Videojuego v=gp.obtener(id);
		
		if(v != null) {
			request.setAttribute("v", v);
			request.getRequestDispatcher("videojuego.jsp").forward(request, response);	
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
