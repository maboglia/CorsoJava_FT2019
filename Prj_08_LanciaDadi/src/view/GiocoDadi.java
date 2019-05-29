package view;

import controller.LanciaDadi;

public class GiocoDadi {

	public static void main(String[] args) {

		
		LanciaDadi ld = new LanciaDadi();
		
		for (int i = 0; i < 1000000; i++) {
			ld.gioca();
		}
		
		System.out.println("partite: "+ld.getGiocate().size());
		System.out.println("successi: "+ld.getSuccessi().size());
		System.out.println("successi1: "+ld.getSuccessi1().size());
		System.out.println("successi2: "+ld.getSuccessi2().size());
		System.out.println("successi3: "+ld.getSuccessi3().size());
		System.out.println("successi4: "+ld.getSuccessi4().size());
		System.out.println("successi5: "+ld.getSuccessi5().size());
		System.out.println("successi6: "+ld.getSuccessi6().size());

	}

}
