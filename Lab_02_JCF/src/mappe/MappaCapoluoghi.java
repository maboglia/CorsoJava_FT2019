package mappe;

import java.util.HashMap;

public class MappaCapoluoghi {

	public static void main(String[] args) {


		HashMap<String, String> regioni = new HashMap<>();
		
		regioni.put("piemonte", "torino");
		regioni.put("lombardia", "milano");
		regioni.put("lazio", "roma");
		regioni.put("campania", "napoli");

		
		
		System.out.println("il capoluogo della campania è:");
		System.out.println(regioni.get("campania"));
		
		
		
		for (String regione : regioni.keySet()) {
			System.out.print(regione + ": ");
			System.out.println(regioni.get(regione));
			
			
		}
		
		
	}

}
