package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("username");
		String pass = request.getParameter("password");
//		System.out.println(nome);
		

		
		if (nome.equals("mauro") && pass.equals("12345")) {
			
			HttpSession sessione = request.getSession();
			sessione.setAttribute("loggato", true);
		
			
			RequestDispatcher rd = request.getRequestDispatcher("blog");
			rd.forward(request, response);			
		}
		
		else {
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);			
		}
	}

}
