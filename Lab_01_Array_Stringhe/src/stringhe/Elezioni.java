package stringhe;

public class Elezioni {

	public static void main(String[] args) {

		//Liste liste = new Liste();
		
		Liste.liste[0].setSimbolo("mare nero");

		System.out.println(Liste.liste[0]);
		Liste.vota("EPP", 10);
		Liste.vota("ALDE&R", 12);
		Liste.vota("GREENS", 3);
		Liste.vota("GREENS", 20);
		Liste.vota("GREENS", 25);
		Liste.vota("ALDE&R", 22);
		Liste.vota("GREENS", 20);
		Liste.vota("GREENS", 12);
		Liste.vota("EPP", 1);
		Liste.vota("ALDE&R", 5);
		Liste.vota("EPP", 10);
		
		System.out.println("----------");
		Liste.vota("EPPIAUAR", 1);
		
		System.out.println("risultati");
		Liste.risultati();
		System.out.println("schede nulle");
		System.out.println(Liste.nulle);
		
		
	}

}
