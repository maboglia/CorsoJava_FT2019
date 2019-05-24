package controller;

import database.ElencoUtenti;
import model.Utente;

public class LoginController {

	//1) mi collego al model
	ElencoUtenti database = new ElencoUtenti();
	
	public void mostraElencoCompleto() {
		
		for (Utente u : database.getUtenti()) {
			System.out.println(u.getNome());
		}
	}
	
	public Utente trovaUtente(String password) {
		
		return database.trovaUtenteByPassword(password);
		
	}
	
}
