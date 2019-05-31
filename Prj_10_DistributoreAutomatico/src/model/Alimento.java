package model;

public class Alimento extends Prodotto{

	protected double peso;
		
	public Alimento(String nome, double prezzo, double peso) {
		super(nome, prezzo);
		this.peso = peso;
		
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Alimento " + this.nome + " il peso del prodotto è: "+ this.peso;
	}
	
	

}
