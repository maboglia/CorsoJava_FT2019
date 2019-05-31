package model;

public class Bevanda extends Prodotto {
	
	protected double volume;
	protected boolean riscaldata;
	
	
	public Bevanda(String nome, double prezzo, double volume, boolean riscaldata) {
		super(nome, prezzo);
		this.volume = volume;
		this.riscaldata=riscaldata;
		
	}


	@Override
	public String toString() {
		return "Bevanda ["
				+ "nome=" + nome 
				+ ", prezzo=" + prezzo
				+ ", riscaldata=" + riscaldata 
				+ ", volume=" + volume 
				+ "]";
	}




}
