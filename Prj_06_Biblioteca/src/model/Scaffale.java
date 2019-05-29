package model;

import java.util.ArrayList;

public class Scaffale {

	private ArrayList<Libro> libriSuScaffale;
	private int numScaffale;
	
	public Scaffale(int numero) {

		this.libriSuScaffale = new ArrayList<>();
		this.numScaffale = numero;
	}

	public ArrayList<Libro> getLibriSuScaffale() {
		return libriSuScaffale;
	}

	public void setLibriSuScaffale(ArrayList<Libro> libriSuScaffale) {
		this.libriSuScaffale = libriSuScaffale;
	}

	public int getNumScaffale() {
		return numScaffale;
	}

	public void setNumScaffale(int numScaffale) {
		this.numScaffale = numScaffale;
	}
	
	
	
}
