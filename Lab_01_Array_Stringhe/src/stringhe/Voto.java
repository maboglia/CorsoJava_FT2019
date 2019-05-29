package stringhe;

public class Voto {

	private String lista;
	private int nVoti;
	private String simbolo;
	
	public Voto(String lista, int nVoti) {
		this.lista = lista;
		this.nVoti = nVoti;
		this.simbolo = "cielo blu";
	}

	public int getnVoti() {
		return nVoti;
	}

	public void setnVoti(int nVoti) {
		this.nVoti = nVoti;
	}

	public String getLista() {
		return lista;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public String toString() {
		return "Voto [lista=" + lista + " " + simbolo + ", nVoti=" + nVoti + "]";
	}
	
	
	
	
}
