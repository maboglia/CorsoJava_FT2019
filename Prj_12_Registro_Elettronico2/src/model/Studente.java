package model;

public class Studente implements Comparable<Studente>{

	private String nome, cognome;
	private int matricola;
	static int immatricolatore = 1;
	
	public Studente() {
		this.matricola = immatricola();
		System.out.println("costruito un oggetto studente senza parametri");
		
	}

	//Overload del metodo costruttore
	/**
	 * Questo è uno dei costruttori dell'oggetto studente
	 * serve per costruire uno studente conoscendo nome e cognome
	 * @param _nome come primo parametro inserire il nome di battesimo
	 * @param _cognome secondo parametro ....
	 */
	public Studente(String _nome, String _cognome) {
		this.nome = _nome;
		this.cognome = _cognome;
		this.matricola = immatricola();
		System.out.println("costruito un oggetto studente con 2 parametri");
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	private int immatricola() {
		//usando l'istruzione return ritorno il valore di immatricolatore
		//usando ++ aumento di uno il valore di immatricolatore
		return immatricolatore++;
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", matricola=" + matricola + "]";
	}

	@Override
	public int compareTo(Studente altroStudente) {

		
		return this.cognome.compareTo(altroStudente.cognome);
		
	}
	
	
	
}
