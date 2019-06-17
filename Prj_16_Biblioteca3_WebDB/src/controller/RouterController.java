package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Libro;

/**
 * Servlet implementation class RouterController
 */
@WebServlet("/router")
public class RouterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RouterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Libreria libreria = new Libreria();
		int idLibro = 1;
		if (request.getParameter("id_libro")!=null) {
			idLibro = Integer.parseInt( request.getParameter("id_libro") );
			Libro l = libreria.trovaLibro(idLibro);
			response.getWriter().append("Il libro richiesto è: ").append(l.toString());		
		} else {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<table class='table table-striped'>");
		
		for (Libro l : libreria.trovaTutti()) {
			sb.append("<tr>");
			sb.append("<td>"+l.getTitolo()+"</td>");
			sb.append("<td>"+l.getPrezzo()+"</td>");
			sb.append("</tr>");
		}
		
		sb.append("</table>");
		
		response.setContentType("text/html");
		request.getRequestDispatcher("header.jsp").include(request, response);
		response.getWriter().append(sb.toString());
		request.getRequestDispatcher("footer.jsp").include(request, response);
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
