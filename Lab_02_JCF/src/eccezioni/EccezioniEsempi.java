package eccezioni;

public class EccezioniEsempi {

	public static void main(String[] args) {
		
		int[] numeri = {2,4,6,8,10};
		
		try {
			
			for (int i = 0; i < numeri.length; i++) {
				int casuale = (int) (Math.random() * 2);
				System.out.println(numeri[i]  / casuale  );
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("si è verificata un'eccezione: hai passato un indice fuori dai confini dell'array");
	
		} catch (ArithmeticException e) {
			System.out.println("hai diviso per 0, non si può fare");
		} catch (Exception e) {
			System.out.println("si è verificato un problema generico");
		}
		
		
		
		
		
		System.out.println("qui prosegue il programma");
		
		

	}

}
