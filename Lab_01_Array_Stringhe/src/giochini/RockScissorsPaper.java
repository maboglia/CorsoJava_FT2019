package giochini;

import java.util.Scanner;

public class RockScissorsPaper {


	static String[] scelte = {"PIETRA", "FORBICI", "CARTA"};
	static int partite=0;
	static int vittorie=0;
	
	public static void main(String[] args) {
		
		int sceltaUtente = 0;
		int sceltaMacchina = 0;
		
		while (sceltaUtente < 3) {
		partite++;
	sceltaUtente = chiediUtente();	
	sceltaMacchina = chiediMacchina();	
	
	String s = trovaVincitore(sceltaUtente,sceltaMacchina);
	System.out.println("------------------------------------------------");
//	System.out.println("Utente ha scelto: " + scelte[sceltaUtente]);
//	System.out.println("Macchina ha scelto: " + scelte[sceltaMacchina]);
	System.out.println("Vincitore: " + s);
	System.out.println("------------------------------------------------");
		}
		
		System.out.println("hai giocato " + partite + " volte");
		System.out.println("hai vinto " + vittorie + " volte");
		
		
	}

	private static String trovaVincitore(int sU, int sM) {
		String s = "";
		
		//{"PIETRA", "FORBICI", "CARTA"}
		if (sU == sM) return "pareggio";
		
		switch (sU) {
		case 0:
			if (sM == 1) {s = "UTENTE"; vittorie++;}
			else s = "MACCHINA";
			break;
		case 1:
			if (sM == 2) {s = "UTENTE"; vittorie++;}
			else s = "MACCHINA";			
			break;
		case 2:
			if (sM == 0) {s = "UTENTE"; vittorie++;}
			else s = "MACCHINA";				
			break;
		}

		return s;
	}

	private static int chiediMacchina() {


		int scelta =  (int) (Math.random() * scelte.length)   ; 
		
		return scelta;
	}

	private static int chiediUtente() {

		Scanner sc = new Scanner(System.in);
		int scelta = 100;
		
		System.out.println("SCEGLI TRA");
		for (String string : scelte) {
			System.out.println(string);
		}
		
		System.out.println("inserisci un numero per la scelta: 0, 1, 2");
		
		if (sc.hasNextInt()) {
		 scelta = sc.nextInt();
		} else {
			System.out.println("inserisci un numero intero");
			scelta = sc.nextInt();
		}
		
		if (scelta >= 0 && scelta < scelte.length) {
		//	System.out.println("L'utente ha scelto: " + scelte[scelta]);
		}
			else 
			System.out.println("non capisco la tua scelta");
	
	
		return scelta;
	
	}
	
	
	
	
	
}
