package array;

public class ProvaArrayMono {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] voti = new int[5];
		voti[0] = 30;
		voti[1] = 20;
		voti[2] = 24;
		voti[3] = 26;
		voti[4] = 28;
		
		int[] voti2 = {30,25,26,27,28};
		
		voti[4] = 27;
		voti2[4] = 27;
		
		int lunghezza = voti.length;
		int lunghezza2 = voti2.length;
		
		int somma = 0;
		int somma2 = 0;
		
		for(int i = 0; i < lunghezza; i++) {
			somma += voti[i];
			System.out.println(voti[i]);
		}
		System.out.println("-----------------------");
		System.out.println(somma/lunghezza);
		System.out.println("-----------------------");
		
		for(int i = 0; i < lunghezza2; i++) {
			somma2 += voti2[i];
			System.out.println(voti2[i]);
		}
		System.out.println("-----------------------");
		System.out.println(somma2/lunghezza2);
		System.out.println("-----------------------");		
		
	}

}
