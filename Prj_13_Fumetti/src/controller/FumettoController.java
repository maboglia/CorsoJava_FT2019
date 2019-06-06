package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Fumetto;


public class FumettoController {

	//private File mioFile = new File("docs/fumetti.txt");
	
	private static ArrayList<Fumetto> collezione = new ArrayList<>();
	
	 static {
		collezione.add(  new Fumetto("La mano rossa", "Tex", "SBE", 1, 1948)  );
		collezione.add(  new Fumetto("Ecco Lupo Alberto", "Lupo", "Silver", 1, 1980)  );
		collezione.add(  new Fumetto("L'alba dei morti viventi", "Dylan Dog", "SBE", 1, 1986)  );
		collezione.add(  new Fumetto("WatchMen", "Watchmen", "DC Comics", 1, 1987)  );
		
	}

	private static void inizializza() {
//		try {
//			Scanner sc = new Scanner(mioFile);
//			
//			while (sc.hasNextLine()) {
//				String nome = sc.nextLine();
//				String[] informazioni = nome.split(";");
//				//(String titolo, String collana, String editore, int numero, int anno)
//				Fumetto temp = new Fumetto(informazioni[1],informazioni[4],informazioni[3],Integer.parseInt(informazioni[0]),Integer.parseInt(informazioni[2]));
//				collezione.add(temp);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}		
	
		collezione.add(  new Fumetto("La mano rossa", "Tex", "SBE", 1, 1948)  );
		collezione.add(  new Fumetto("Ecco Lupo Alberto", "Lupo", "Silver", 1, 1980)  );
		collezione.add(  new Fumetto("L'alba dei morti viventi", "Dylan Dog", "SBE", 1, 1986)  );
		collezione.add(  new Fumetto("WatchMen", "Watchmen", "DC Comics", 1, 1987)  );
		
	}
	
	public static ArrayList<Fumetto> getCollezione() {
		return collezione;
	}
	
	public static Fumetto getFumettoById(int id) {
		
		return collezione.get(id);
		
	}
	
	public static boolean aggiungiFumetto(String titolo, String collana, String editore, int numero, int anno) {
		return collezione.add(  new Fumetto(titolo, collana, editore, numero, anno)  );
	}

}
