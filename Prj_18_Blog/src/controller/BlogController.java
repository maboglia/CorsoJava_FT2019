package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PostDAO;
import dao.UserDAO;
import model.Post;

/**
 * Servlet implementation class BlogController
 */
@WebServlet("/blog")
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessione = request.getSession();
		
		if (sessione.getAttribute("loggato")!= null) {
		
		
		PostDAO ud = new PostDAO();
		StringBuilder sb = new StringBuilder();
		
		for (Post post : ud.getAll()) {
			
			UserDAO utente = new UserDAO();
			
			sb.append(utente.getById(post.getUserId()).getUsername());
			sb.append("<h2>" + post.getTitle() + "</h2>");
			sb.append("<p>" +post.getBody() + "</p>");
			
			System.out.println(post.getTitle());
		}
		
		
		// TODO Auto-generated method stub
		response.getWriter().append("<h1>i post su questo blog: </h1>").append(sb.toString());
		}
		else 
			response.getWriter().append("<h1>per accedere al blog devi fare il login</h1>");
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
