package controller;

import model.Studente;

public class Registro {

	Studente[] registro;
	
	public Registro() {
		this.registro = new Studente[15];
		inizializza();
	}

	private void inizializza() {
		registro[0] = new Studente("ABOUARAB", 	"SOUHILA");
		registro[1] = new Studente("BUSINARO", 	"CHIARA");
		registro[2] = new Studente("BUSTERNA", 	"LISA");
		registro[3] = new Studente("CALFA", 	"MATTEO");
		registro[4] = new Studente("CIELO", 	"NATASCIA");
		registro[5] = new Studente("EVANGELISTA DA FROTA",  "JULIANA" );	
		registro[6] = new Studente("GARAVELLI", 	"GIORGIO");
		registro[7] = new Studente("GIACULLI", 	"FEDERICO");	
		registro[8] = new Studente("ISOLDI", 	"MATTIA");
		registro[9] = new Studente("PAES", 	"TIAGO");
		registro[10] = new Studente("PARISI", 	"DEBORA");
		registro[11] = new Studente("RINALDI", 	"ELENA");
		registro[12] = new Studente("SALTON BRUNASSI",  "JORGE FELIPE");	
		registro[13] = new Studente("VACCA", 	"DAVIDE");
		registro[14] = new Studente("ALEX", 	"PINZI");
		
	}
	
	public void stampaAllievi() {
		
		for (int i = 0; i < registro.length; i++) {
			System.out.println(registro[i]);
		}
		
	}
	
	
}
