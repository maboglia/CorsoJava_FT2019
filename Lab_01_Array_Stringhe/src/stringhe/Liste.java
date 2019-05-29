package stringhe;

public class Liste {
	
//	static String[] liste = {
//			"EPP",
//			"ALDE&R",
//			"GREENS"
//	};
//	
	static int nulle = 0;
	
//	static int[] votiLista = new int[3];

	static Voto[] liste = {
			new Voto("EPP", 0),
			new Voto("ALDE&R", 0),
			new Voto("GREENS", 0),
	};
	
	
	
	static void vota (String partito, int voti) {
		
		for (Voto voto : liste) {
			if (voto.getLista().equals(partito)) {
				System.out.println("voto valido");
				voto.setnVoti( voto.getnVoti() + voti  );
			}
			
		}
		
	}
	
	static void risultati() {
		
		for (Voto voto : liste) {
			System.out.println(voto);
		}
		
	}

}
