package model;

public class Utente {

	private String nome, password;
	
	
	public Utente(String nome, String password) {

		this.nome = nome;
		this.password = password;
		
	}


	public String getNome() {
		return "Sig. " + nome;
	}

	public String getPassword() {
		return password;
	}


	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", password=" + password + "]";
	}
	
	
}
