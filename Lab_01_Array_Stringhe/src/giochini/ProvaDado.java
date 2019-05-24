package giochini;

public class ProvaDado {

	public static void main(String[] args) {
		
		Dado d1 = new Dado((byte) 6, "bianco");
		Dado d2 = new Dado((byte) 6, "rosso");

		int successi = 0;
		final int TENTATIVI = 1_000_000;
		
		for (int i = 0; i<TENTATIVI;i++) {
		
			byte r1 = d1.lanciaDado();
			byte r2 = d2.lanciaDado();
			
			//System.out.println("sono usciti: " + r1 + " " + r2);
			if ( (r1 + r2) == 7    ) {
				successi++;
			}
		}
		
		double percentuale = (double) successi / TENTATIVI * 100;
		
		System.out.println("hai vinto: " + successi + " volte");
		System.out.println("percentuale: " + percentuale +"%");
		
	}

}
