package view;

import model.Libro;
import model.Scaffale;

public class ProvaLibro {

	public static void main(String[] args) {

		Libro l1 = new Libro("I segreti di Asgralot", "Paccani", 512);
		Libro l2 = new Libro("Il signore degli anelli", "Tolkien", 1264);
		Libro l3 = new Libro("Orgoglio e pregiudizio", "Austen", 220);
		
		
		Scaffale sc = new Scaffale(1);
		Scaffale sc2 = new Scaffale(2);
		
		sc2.getLibriSuScaffale().add(l3);
		
		sc.getLibriSuScaffale().add(l1);
		sc.getLibriSuScaffale().add(l2);
		
		System.out.println("lo scaffale n." + sc.getNumScaffale() );
		System.out.println("contiene " + sc.getLibriSuScaffale().size() + "libri");
		

	}

}
