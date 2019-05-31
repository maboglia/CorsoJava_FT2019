
public class Principale {

	public static void main(String[] args) {

		int euri = 12346;
		String[] tagli = {
			"500", 	
			"200", 	
			"100", 	
			"50", 	
			"20", 	
			"10", 	
			"5", 	
			"2", 	
			"1", 	
		};
		
		//nell array di interi r memorizzo i valori di ritorno della classe....
		int[] r = CambiaMonete.cambia(euri);
		
		for (int i = 0; i < tagli.length; i++) {
			
			int risultato = Integer.parseInt(  tagli[i]  )  * r[i]  ;
			
			System.out.println(tagli[i]+": "+ r[i] + " = " +  risultato);
		}
		
	}


}
