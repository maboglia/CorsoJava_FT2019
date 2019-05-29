package collezioni;

import java.util.ArrayList;

public class CollezioneStringhe {

	public static void main(String[] args) {

		String[] nani = new String[7];
		nani[0] = "pisolo";
		nani[1] = null;
		nani[2] = "cucciolo";
		nani[3] = "eolo";
		nani[4] = "mammolo";
		nani[5] = "dotto";
		nani[6] = "brontolo";
		
//		for (String nano : nani) {
//			System.out.println(nano);
//		}
		
		ArrayList<String> nani2 = new ArrayList<>();
		nani2.add("pisolo");
		
		System.out.println(nani2.size());
		
		nani2.add("gongolo");
		System.out.println(nani2.size());

		//System.out.println(nani2.get(0));
		
		nani2.remove(0);
		
		for (String nano : nani2) {
		System.out.println(nano);
		}		
		System.out.println(nani2.size());		
	}

}
