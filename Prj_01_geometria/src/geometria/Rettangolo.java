package geometria;

public class Rettangolo {

	private double base, altezza;
	
	Rettangolo(double base, double altezza){
		this.base = base;
		this.altezza = altezza;
		System.out.println("ho costruito il rettangolo dimensioni: " );
		System.out.println("base: " + this.base);
		System.out.println("altezza: " + this.altezza);
	}
	
	double calcolaArea() {
		return this.base * this.altezza;
	}
	double calcolaPerimetro() {
		return (this.base * 2) +  (this.altezza * 2);
	}
	
}
