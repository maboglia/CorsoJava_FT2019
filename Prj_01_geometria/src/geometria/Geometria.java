package geometria;

import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		// creare un oggetto di tipo triangolo, 
		//a partire dal modello definito nella classe triangolo

		Scanner scanner = new Scanner(System.in);
		System.out.println("inserisci un valore per la base");
		double b = scanner.nextDouble();

		System.out.println("inserisci un valore per l'altezza");
		double a = scanner.nextDouble();
		
		
		Triangolo t1 = new Triangolo(b,a);
		System.out.println("figura n.: " + t1.getFigura());
		System.out.println("L'area del triangolo è: " + t1.calcolaArea());
		System.out.println("Il perimetro del triangolo è: " + t1.calcolaPerimetro());
		System.out.println("------------------------------------");
		Triangolo t2 = new Triangolo(7,4);
		System.out.println("figura n.: " + t2.getFigura());
		System.out.println("L'area del triangolo è: " + t2.calcolaArea());
		System.out.println("Il perimetro del triangolo è: " + t2.calcolaPerimetro());
		System.out.println("------------------------------------");
		
		Rettangolo r1 = new Rettangolo(b,a);
		System.out.println(r1.calcolaArea());
		System.out.println(r1.calcolaPerimetro());
		
		System.out.println("totale triangoli: " + Triangolo.contatore);
	}

}
