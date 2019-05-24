package model;

public class Utente {

	private  String nome, password;

	public Utente() {
		this.nome = "mauro";
		this.password = "12345";
	}
	
	public Utente(String nome, String password) {
		this.nome = nome;
		this.password = password;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getPassword() {
		return password;
	}
	
	public boolean verificaLogin(String chiediNome, String chiediPass) {
		boolean isLogged = (   this.nome.equals(chiediNome)  && this.password.equals(chiediPass)   );
		return isLogged;			
	}
}