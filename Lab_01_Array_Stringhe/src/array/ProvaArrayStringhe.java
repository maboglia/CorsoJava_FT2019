package array;

public class ProvaArrayStringhe {

	public static void main(String[] args) {


		String[] nani = {
				"pisolo",
				"brontolo",
				"cucciolo",
				"mammolo",
				"eolo",
				"dotto",
				"gongolo",
				};

		try {
		System.out.println(nani[-1]);
		}
		catch(Exception e) {
			System.out.println("si è verificata una eccezione!!!!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("si è piantato");
		
		for (int i = 0; i < nani.length; i++) {
			System.out.println(nani[i]);
		}
		
		
	}

}
