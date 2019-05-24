package giochini;

public class Dado {

	//variabili di istanza
	byte facce;
	String colore;
	
	public Dado(byte facce, String colore) {
		this.facce = facce;
		this.colore = colore;
		System.out.println("dado costruito");
	}
	
	public byte lanciaDado() {
		
		//variabile locale
		byte casuale = 0;
		
		
		casuale =  (byte) Math.floor(Math.random() * this.facce) ;
		casuale = (byte) (casuale + 1);
		
		return casuale;
	}
	
}
