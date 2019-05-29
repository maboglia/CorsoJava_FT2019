package view;

import java.util.Scanner;

import controller.Todo;

public class TodoList {

	static Todo cosedafare1 = new Todo();
	//static Todo cosedafare2 = new Todo();

	public static void main(String[] args) {

		//varabili locali (al metodo)
		
		menuPrincipale();		
		
		if (cosedafare1.getElenco().size() > 0) {
			System.out.println("elenco completo");
			cosedafare1.stampaElenco();
		}
		
		System.out.println("programma terminato, arrivederci :)");
	}

	private static void menuPrincipale() {
		boolean esci = false;
		int contatore = 0;		
		String nomeCosa = null;
		Scanner input = new Scanner(System.in);
		
		while(!esci) {
			System.out.println("cosa vuoi fare?\ni) inserisci\ne) elimina\ns) per stampare elenco \nscrivi 'esci' per uscire");
			nomeCosa = input.next();			
			if (nomeCosa.equals("esci"))
				esci = true;
			else if (nomeCosa.equals("i"))
				aggiungiCose();
			else if (nomeCosa.equals("e"))
				System.out.println("vuoi eliminare");
			else if (nomeCosa.equals("s"))
				cosedafare1.stampaElenco();
				
		}
	}
	
	private static void aggiungiCose() {
		String nomeCosa = null;
		Scanner input = new Scanner(System.in);
		boolean esci = false;
		int contatore = 0;
		
		while(!esci) {
			System.out.println("inserisci una cosa \nscrivi 'esci' per uscire");
			nomeCosa = input.next();
			if (nomeCosa.equals("esci"))
				esci = true;
			else {
				cosedafare1.aggiungi(nomeCosa);
			}
		}
	}

}
