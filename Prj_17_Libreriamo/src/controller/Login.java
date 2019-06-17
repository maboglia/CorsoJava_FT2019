package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Router
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("sono la servlet login, hai chiamto il metodo GET");
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (username.equals("mauro") && password.equals("12345"))
		{
			req.setAttribute("logged", "autorizzato");
			req.getSession().setAttribute("logged", true);
			req.getRequestDispatcher("area_riservata.jsp").forward(req, resp);
		}
		else
		resp.getWriter().append("Non sei autorizzato, riprova!");
		
	}
	
	

}
