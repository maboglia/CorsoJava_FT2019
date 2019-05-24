package settimana1.giorno2;

public class Triangolo {

	//stato interno, elenco le proprietà, chiamate anche attributi, della classe
	private double base, altezza;
	private double area, perimetro;
	private int figura;
	//li ho dichiarati privati per rispettare l'incapsulamento
	
	//var static per contare i triangoli prodotti dalla classe
	static int contatore = 0;
	
	//metodo costruttore del triangolo
	Triangolo(double b, double a){
		
		base = b;
		altezza = a;
		this.figura = contatore++;
	}
	
	//
	double calcolaArea() {
		area = (double) base * altezza / 2 ;
		return area;
	}
	
	double calcolaPerimetro() {
		double ipotenusa;
		ipotenusa = Math.sqrt( Math.pow(base, 2)  + (altezza * altezza)   );
		perimetro = ipotenusa + base + altezza;
		
		return perimetro;
	}
	//metodo getter della proprietà figura
	public int getFigura() {
		return figura;
	}
	
}
