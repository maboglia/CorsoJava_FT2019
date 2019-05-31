package view;

import controller.Distributore;
import model.*;


public class ProvaDistributore {

	public static void main(String[] args) {

		Distributore d = new Distributore();
		d.riempiDistributore();
		
//		for (Bevanda b : d.getBevande()) {
//			System.out.println(b);
//		}
//		
//		for (Alimento a : d.getAlimenti()) {
//			System.out.println(a);
//		}
//		
		for (Prodotto p : d.getProdotti()) {
			System.out.println(p);
		}
	}

}
