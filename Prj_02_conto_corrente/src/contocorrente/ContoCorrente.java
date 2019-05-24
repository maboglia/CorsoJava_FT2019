package contocorrente;

public class ContoCorrente {

	//questa variabile appartiene alla class CC
	private static int contatore=1001;
	
	//quest var appartengo agli oggetti di tipo CC
	private int numeroConto;
	private String titolare;
	//TODO: crea class Cliente
	private double saldo;
	
	public ContoCorrente(String titolare) {

		this.titolare = titolare;
		this.saldo = 0;
		this.numeroConto = contatore++;
		System.out.println("creato conto  " + 
				this.numeroConto +
				" intestato a " +
				this.titolare);
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}

	public static int getContatore() {
		return contatore;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void versamento(double somma) {
		this.saldo += somma;
	}
	public void prelievo(double somma) {
		if (somma <= this.saldo)
			this.saldo -= somma;
		else 
			System.out.println("disponibilità del conto insufficiente");
	}
	
	
}
