package contocorrente;

import java.util.Scanner;

public class ProvaConto {

	public static void main(String[] args) {

		disegnaMenu();
		
	}

	private static void disegnaMenu() {
		int scelta = 0;
		double somma = 0;
		ContoCorrente conto1 = null;
		//menu
		System.out.println("Quale operazione?");
		System.out.println("1) apertura conto");
		System.out.println("2) versamento");
		System.out.println("3) prelievo");
		System.out.println("4) estratto conto");
		System.out.println("5) visualizza saldo");
		System.out.println("0) esci");
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		
		scelta = input.nextInt();

		while (scelta != 0) {
			
			System.out.println("hai scelto: " + scelta);
			
			switch (scelta) {
			case 1:
				System.out.println("hai scelto di aprire un conto");
				System.out.println("a chi vuoi intestarlo");
				String titolare = input.next();
				conto1 = new ContoCorrente(titolare);				
				scelta = 0;
				break;
			case 2:
				System.out.println("hai scelto di fare un versamento");
				System.out.println("quanto vuoi versare?");
				 somma = input.nextDouble();
				conto1.versamento(somma);
				break;
			case 3:
				System.out.println("hai scelto di fare un prelievo");
				System.out.println("quanto vuoi prelevare?");
				 somma = input.nextDouble();

				conto1.prelievo(somma);				
				break;
			case 4:
				System.out.println("hai scelto estratto conto");
				break;
			case 5:
				System.out.println("hai scelto visualizza saldo conto");
				System.out.println(conto1.getSaldo());				
				break;

			default:
				System.out.println("inserisci un numero tra 1 e 5, 0 per uscire");
				break;
			}//fine blocco switch
			
			System.out.println("altre operazioni?");
			scelta = input.nextInt();
			
			//scelta = input.nextInt();
		}//fine del ciclo while
		
		System.out.println("arrivederci");
		
		
	}

}
