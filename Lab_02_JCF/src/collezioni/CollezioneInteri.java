package collezioni;

import java.util.ArrayList;

public class CollezioneInteri {

	public static void main(String[] args) {


		int[] voti = {25,30,28,27,24};
		
		double media=0;
		double totale=0;
		
		for (int voto : voti) {
			totale += voto;
		}
		
		System.out.println(totale);
		
		media = totale / voti.length;
		
		System.out.println(media);
		
		ArrayList<Integer> voti2 = new ArrayList<>();
		
		totale = 0;
		media = 0;
		
		voti2.add(25);
		voti2.add(30);
		voti2.add(28);
		voti2.add(27);
		voti2.add(24);
		voti2.add(30);
		voti2.add(18);

		for (int voto : voti2) {
			totale += voto;
		}
		System.out.println(totale);
		
		media = totale / voti2.size();
		
		System.out.println(media);
				
		
	}

}
