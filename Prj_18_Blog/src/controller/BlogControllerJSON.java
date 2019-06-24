package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.PostDAO;
import dao.UserDAO;
import model.Post;
import model.User;

/**
 * Servlet implementation class BlogController
 */
@WebServlet("/json")
public class BlogControllerJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogControllerJSON() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PostDAO ud = new PostDAO();
		StringBuilder sb = new StringBuilder();
		Gson json = new Gson();
		UserDAO utenteProva = new UserDAO();
		User mauro = utenteProva.getById(1);
		String rispostaJSON = json.toJson(ud.getAll());
		
		for (Post post : ud.getAll()) {
			
			UserDAO utente = new UserDAO();
			
			sb.append(utente.getById(post.getUserId()).getUsername());
			sb.append("<h2>" + post.getTitle() + "</h2>");
			sb.append("<p>" +post.getBody() + "</p>");
			
			System.out.println(post.getTitle());
		}
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		// TODO Auto-generated method stub
		//response.getWriter().append("<h1>i post su questo blog in formato JSON: </h1>").append(sb.toString());
		response.getWriter().append(rispostaJSON);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
