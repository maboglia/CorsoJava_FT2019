package database;

import model.Utente;

public class ElencoUtenti {

	
	//1) TODO: scaricare i dati degli utenti da database e creare un array di tutti gli utenti
	
	
	//2) metti gli utenti scaricati nel seguente contenitore
	//TODO: trasformare l'array in arraylist
	private Utente[] utenti =  {

		    new Utente("ABOUARAB", 	"SOUHILA"),//0
		    new Utente("BUSINARO", 	"CHIARA"),
		    new Utente("BUSTERNA", 	"LISA"),
		    new Utente("CALFA", 	"MATTEO"),
		    new Utente("CIELO", 	"NATASCIA"),
		    new Utente("EVANGELISTA DA FROTA",  "JULIANA" ),//5
		    new Utente("GARAVELLI", 	"GIORGIO"),
		    new Utente("GIACULLI", 	"FEDERICO"),
		    new Utente("ISOLDI", 	"MATTIA"),
		    new Utente("PAES", 	"TIAGO"),
		    new Utente("PARISI", 	"DEBORA"),
		    new Utente("RINALDI", 	"ELENA"),//11
		    new Utente("SALTON BRUNASSI",  "JORGE FELIPE"),
		    new Utente("VACCA", 	"DAVIDE"),
		    new Utente("ALEX", 	"PINZI")
		};

	public Utente[] getUtenti() {
		return utenti;
	}
	
	public Utente trovaUtente(int id) {
		
		return this.utenti[id];
		
	}
	
	public Utente trovaUtenteByPassword(String password) {
		//uso il 'foreach' 
		for ( Utente u : utenti  ) {
			if (u.getPassword().equals(password))
				return u;
		}
		return null;
		
		
	}
	
	
	
}
