package view;

import java.util.Scanner;

import model.Utente;

public class Login {

	static Utente u = new Utente();
	
	public static void main(String[] args) {
		faiLogin();
		
	}

	private static void faiLogin() {
		
		System.out.println("-----------");
		System.out.println("procedura LOGIN");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci username");
		String chiediNome = sc.next();
		System.out.println("inserisci password");
		String chiediPass = sc.next();
		
		boolean seiLoggato = u.verificaLogin(chiediNome, chiediPass);
		System.out.println(seiLoggato);
		
		
	}


}
