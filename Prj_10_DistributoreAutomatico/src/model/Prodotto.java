package model;

public class Prodotto {

	protected String nome;
	protected double prezzo;
	

	public Prodotto(String nome, double prezzo) {
	
		this.nome = nome;
		this.prezzo = prezzo;
		System.out.println("prodotto costruito");
	}

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + "]";
	}
	
	
}
