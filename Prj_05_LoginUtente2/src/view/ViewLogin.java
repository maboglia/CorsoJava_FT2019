package view;

import java.util.Scanner;

import controller.LoginController;
import model.Utente;

public class ViewLogin {

	static LoginController lc = new LoginController();

	
	public static void main(String[] args) {
		
		
		//lc.mostraElencoCompleto();
		
		Utente u = mostraLogin();
		if (u != null)
		System.out.println(u);
		else 
			System.out.println("password errata, non puoi entrare!!!");
		
	}

	private static Utente mostraLogin() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Procedura login");
		
		System.out.println("Inserire nome utente");
		String username = sc.next();

		System.out.println("Inserire password utente");
		String password = sc.next();

		Utente u = lc.trovaUtente(password);
		
		return u;
		
	}

	
	
	
	
	
	
}
