package principale;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Utente;

public class LeggiFile {

	public static void main(String[] args) {


		File mioFile = new File("files/elenco2.txt");
		
		ArrayList<Utente> studenti = new ArrayList<>();
		
		
		try {
			Scanner sc = new Scanner(mioFile);
			
			while (sc.hasNextLine()) {
				String nome = sc.nextLine();
				String[] informazioni = nome.split(",");
				Utente temp = new Utente(informazioni[0], informazioni[1].toLowerCase());
				studenti.add(temp);
				//System.out.println(sc.nextLine());
				
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (Utente utente : studenti) {
			System.out.println(utente);
		}
		
		

	}

}
