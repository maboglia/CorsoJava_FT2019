package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import model.Studente;

public class Registro {

	private File mioFile = new File("docs/elenco2.txt");
	private ArrayList<Studente> registro, presenti, assenti;
	private Scanner sc;
	
	public Registro() {
		this.registro = new ArrayList<>();
		this.presenti = new ArrayList<>();
		this.assenti = new ArrayList<>();
		this.sc =  new Scanner(System.in);
		inizializza();
	}

	
	private void inizializza() {
		try {
			Scanner sc = new Scanner(mioFile);
			
			while (sc.hasNextLine()) {
				String nome = sc.nextLine();
				String[] informazioni = nome.split(",");
				Studente temp = new Studente(informazioni[1], informazioni[0]);
				registro.add(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void stampaAllievi() {
		
		for (Studente studente : registro) {
			System.out.println(studente);
		}
		
	}


	public void faiAppello() {
		
			this.presenti.clear();
			this.assenti.clear();
		
		for (Studente studente : registro) {
			System.out.println("è presente " + studente.getCognome() + "?");
			if (sc.next().equalsIgnoreCase("s"))
				this.presenti.add(studente);
			else
				this.assenti.add(studente);
		}
		
	}
	
	public void mostraAssenti() {
		for (Studente studente : assenti) {
			System.out.println(studente);
		}
		System.out.println("gli allievi presenti in aula sono: " + assenti.size());
		
	}
	
	public void mostraPresenti() {
		for (Studente studente : presenti) {
			System.out.println(studente);
		}
		System.out.println("gli allievi presenti in aula sono: " + presenti.size());
		
	}


	public void elencoAlfabetico() {

		//ordinare gli studenti alfabeticamente
		Collections.sort(registro);
		
		for (Studente studente : registro) {
			System.out.println(studente);
		}
	}
	
	
}
