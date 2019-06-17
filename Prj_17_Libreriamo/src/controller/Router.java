package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LibroDAO;
import model.Libro;

/**
 * Servlet implementation class Router
 */
@WebServlet("/sezioni")
public class Router extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("libri").equals("all")) {
			LibroDAO ld = new LibroDAO();
			try {
				ArrayList<Libro> libri = ld.findAll();
				
				request.setAttribute("libri", libri);
				request.getRequestDispatcher("elenco.jsp").forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		response.getWriter().append("sono la servlet sezioni, qui trovi le sezioni della libreria");
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String titolo = req.getParameter("titolo");
		String prezzo = req.getParameter("prezzo");
		
		Libro l = new Libro();
		l.setTitolo(titolo);
		l.setPrezzo(  Double.parseDouble(prezzo)  );
		
		LibroDAO ld = new LibroDAO();
		try {
			ld.addOne(l);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
