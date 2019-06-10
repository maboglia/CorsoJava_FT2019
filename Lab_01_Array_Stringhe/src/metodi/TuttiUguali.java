package metodi;

import java.util.Scanner;

/**
 * 
 * @author teacher
 *Scrivere un programma "TuttiUguali" che chiede all'utente di inserire tre numeri e
stampa "Tutti uguali!" se i tre numeri sono tutti uguali, e altrimenti stampa "Almeno uno e' diverso".
Il controllo che i tre numeri siano uguali dovrà essere fatto da un metodo ausiliario, mentre il messaggio
dovra essere stampato dal metodo main. Il nome del metodo ausiliario può essere scelto a piacere.
 *
 */


public class TuttiUguali {

	public static void main(String[] args) {

		//che chiede all'utente di inserire tre numeri	
		Scanner sc = new Scanner(System.in);
		System.out.println("inserire tre numeri	interi");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		//il messaggio dovrà essere stampato dal metodo main
		String messaggio = verificaUguaglianza(a,b,c);
		System.out.println(messaggio);
		
	}

	private static String verificaUguaglianza(int a, int b, int c) {
		
		if ((a == b) && (b == c))
			return "sono uguali";

		return "NON sono uguali";
	}

}
