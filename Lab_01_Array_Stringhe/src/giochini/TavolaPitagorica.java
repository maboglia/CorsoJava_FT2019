package giochini;

public class TavolaPitagorica {

	public static void main(String[] args) {


		final int RIGHE = 1000;
		final int COLONNE = 1000;

		long start = System.currentTimeMillis();
		
		for (int i = 1; i <= RIGHE ; i++) {
			
			for (int j = 1; j <= COLONNE; j++) {

				System.out.print(i * j + "\t");
				
			}
			System.out.println();
			
			
		}
		long stop = System.currentTimeMillis();
		
		System.out.println("l'elaborazione è durata: " +  (  stop - start  ) );
		
		
		
		

	}

}
