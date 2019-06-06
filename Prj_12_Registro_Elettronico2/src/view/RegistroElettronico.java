package view;

import java.util.Scanner;

import controller.Registro;
import model.Studente;

public class RegistroElettronico {

	private static Scanner sc = new Scanner(System.in);
	private static Registro regClasse1F = new Registro();
	
	public static void main(String[] args) {

		boolean esci = false;
		
		while(!esci) {
				esci = menu();
		}
	}

	private static boolean sceltaUtente() {
		System.out.println("vuoi uscire?");
		String s = sc.next();
		if (s.equalsIgnoreCase("s"))
			return true;
		
		return false;
	}

	static boolean menu() {
		
		System.out.println("----------------------");
		System.out.println("Menu");
		System.out.println("----------------------");
		System.out.println("a) appello");
		System.out.println("b) elenco");
		System.out.println("c) presenti");
		System.out.println("d) assenti");
		System.out.println("e) elenco alfabetico");
		System.out.println("z) uscita");
		
		String s = sc.next();
		
		switch (s) {
		case "a":
			//fare appello
			regClasse1F.faiAppello();
			break;

		case "b":
			//stampare elenco
			regClasse1F.stampaAllievi();
			break;
			
		case "c":
			//presenti
			regClasse1F.mostraPresenti();
			break;
			
		case "d":
			//assenti
			regClasse1F.mostraAssenti();
			break;
			
		case "e":
			//stampare elenco ordinato (cognome asc)
			regClasse1F.elencoAlfabetico();
			break;
			
		default:
			return sceltaUtente();

		}
		
		return false;
	}
	
	
	
}
