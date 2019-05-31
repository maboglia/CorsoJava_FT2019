package controller;

import java.util.ArrayList;

import model.*;

public class Distributore {

	private ArrayList<Bevanda> bevande = new ArrayList<>();
	private ArrayList<Alimento> alimenti = new ArrayList<>();
	private ArrayList<Prodotto> prodotti = new ArrayList<>();
	
	
	public ArrayList<Bevanda> getBevande() {
		return bevande;
	}



	public ArrayList<Alimento> getAlimenti() {
		return alimenti;
	}

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}


	public void riempiDistributore() {
		
		bevande.add(new Bevanda("caffe espresso", 0.3, 30, true));
		bevande.add(new Bevanda("caffe lungo", 0.4, 40, true));
		bevande.add(new Bevanda("caffe ginseng", 0.5, 50, true));
		
		alimenti.add(new Alimento("panino prosciutto", 1.2, 150));
		alimenti.add(new Alimento("panino maxi prosciutto", 2.5, 450));
		alimenti.add(new Alimento("panino maxi vegano", 2.8, 150));
		
		prodotti.add(new Bevanda("caffe espresso", 0.3, 30, true));
		prodotti.add(new Alimento("panino prosciutto", 1.2, 150));

	}

	
	
}
