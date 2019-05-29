package controller;

import java.util.ArrayList;

import model.Cosa;

public class Todo {

	ArrayList<Cosa>  elenco = new ArrayList<>();
	
	public void aggiungi(Cosa c) {
		elenco.add(c);
	}
	
	public void aggiungi(String s) {
		Cosa c = new Cosa(s);
		elenco.add(c);
	}
	
	public void stampaElenco() {
		for (Cosa cosa : elenco) {
			System.out.println(cosa);
		}
	}
	
	public ArrayList<Cosa> getElenco() {
		return elenco;
	}
	
}
