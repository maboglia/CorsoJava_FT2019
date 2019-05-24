package stringhe;

public class ProvaStringhe {

	public static void main(String[] args) {

		String s1 = "Ciao, mondo!";
		
		String s2 = "Ciao, ";
		
		String s3 = "mondo!";
		
		String s4 = s2 + s3 ;
		
		System.out.println(  s1 == s4  );
		System.out.println(s1.equals(s4));
		System.out.println("la stringa s1: " + s1);
		System.out.println("la stringa s4: " + s4);

		for (int i = 0; i < s1.length(); i++) {
			
			System.out.println(     s1.charAt(  i   )    );
		}
		
		char[] vocali = {'a','e', 'i', 'o', 'u'};
		String pippo = new String(vocali);
		System.out.println(pippo);
		
		
	}

}
