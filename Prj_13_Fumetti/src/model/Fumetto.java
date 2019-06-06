package model;

public class Fumetto implements Comparable<Fumetto>{

	private String titolo, collana, editore;
	private int numero, anno;
	
	public Fumetto(String titolo, String collana, String editore, int numero, int anno) {
		this.titolo = titolo;
		this.collana = collana;
		this.editore = editore;
		this.numero = numero;
		this.anno = anno;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getCollana() {
		return collana;
	}

	public void setCollana(String collana) {
		this.collana = collana;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Fumetto [titolo=" + titolo + ", collana=" + collana + ", editore=" + editore + ", numero=" + numero
				+ ", anno=" + anno + "]";
	}

	@Override
	public int compareTo(Fumetto o) {
		
		int comparazione = 0;
		
		if (this == o)
			comparazione = 0;
		else if (this.getTitolo().compareTo(o.getTitolo()) < 0)
			comparazione = -1;
		else if (this.getTitolo().compareTo(o.getTitolo()) > 0)
			comparazione = 1;
				
		return comparazione;
	}
	
	
	
	
	
	
}
