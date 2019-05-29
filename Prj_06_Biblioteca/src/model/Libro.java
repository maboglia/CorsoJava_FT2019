package model;

public class Libro {

	private String titolo;
	private String autore;
	private int nPagine;
	private boolean disponibile;

	public Libro() {}
	
	public Libro(String titolo, String autore, int nPagine) {
		
		this.titolo = titolo;
		this.autore = autore;
		this.nPagine = nPagine;
		this.disponibile = true;
		System.out.println("libro \"" + titolo  +"\" costruito");
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) {
		this.nPagine = nPagine;
	}

	public boolean isDisponibile() {
		return disponibile;
	}

	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", autore=" + autore + ", nPagine=" + nPagine + ", disponibile="
				+ disponibile + "]";
	}
	
	
	
	
}
