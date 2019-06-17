package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.LibroDAO;
import model.Libro;

public class Libreria {

	LibroDAO ld = new LibroDAO();
	
	public Libro trovaLibro(int libroId) {
	
		Libro l = null;
		
		try {
			l = ld.findOne(libroId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return l;
	}
	
	
	public ArrayList<Libro> trovaTutti() {
		
		ArrayList<Libro> libri = null;
		
		try {
			libri = ld.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return libri;
	}
	
	
	
}
