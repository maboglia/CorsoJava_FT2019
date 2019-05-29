package model;

import java.util.Date;

public class Cosa {

	private String descrizione;
	private Date data;
	private boolean completato;
	
	public Cosa(String descrizione) {
		
		this.descrizione = descrizione;
		this.data = new Date();
		this.completato = false;
	}

	public Cosa(String descrizione, Date data) {

		this.descrizione = descrizione;
		this.data = data;
		this.completato = false;
		}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setCompletato(boolean completato) {
		this.completato = completato;
	}
	
	@Override
	public String toString() {
		return this.data + ": " + this.descrizione + " \ncompletato: " + this.completato;
	}
	
	
	

	
	
	
}
