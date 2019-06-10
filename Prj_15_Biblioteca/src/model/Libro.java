package model;

public class Libro {

	private String titolo;
	private int editoreId, pagine, libroId;
	private double prezzo;
	
	public Libro() {
	
	}

	public Libro(String titolo, int editoreId, int pagine, double prezzo) {
		this.titolo = titolo;
		this.editoreId = editoreId;
		this.pagine = pagine;
		this.prezzo = prezzo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getEditoreId() {
		return editoreId;
	}

	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public int getLibroId() {
		return libroId;
	}

	public void setLibroId(int libroId) {
		this.libroId = libroId;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "titolo=" + titolo + ", prezzo=" + prezzo + "";
	}
	
	
	
}
