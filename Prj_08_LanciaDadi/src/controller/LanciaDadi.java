package controller;

import java.util.ArrayList;

import model.Dado;

public class LanciaDadi {

	final int NUM_FACCE = 6; 
	Dado d1 = new Dado(NUM_FACCE, "rosso");
	Dado d2 = new Dado(NUM_FACCE, "verde");
	
	ArrayList<String> giocate = new ArrayList<>();
	ArrayList<Integer> successi = new ArrayList<>();
	
//	ArrayList<Integer>[] successiFacce = new ArrayList[NUM_FACCE];
	
	ArrayList<Integer> successi1 = new ArrayList<>();
	ArrayList<Integer> successi2 = new ArrayList<>();
	ArrayList<Integer> successi3 = new ArrayList<>();
	ArrayList<Integer> successi4 = new ArrayList<>();
	ArrayList<Integer> successi5 = new ArrayList<>();
	ArrayList<Integer> successi6 = new ArrayList<>();
	
	public ArrayList<String> getGiocate() {
		return giocate;
	}

	public ArrayList<Integer> getSuccessi() {
		return successi;
	}

	public ArrayList<Integer> getSuccessi1() {
		return successi1;
	}

	public ArrayList<Integer> getSuccessi2() {
		return successi2;
	}

	public ArrayList<Integer> getSuccessi3() {
		return successi3;
	}

	public ArrayList<Integer> getSuccessi4() {
		return successi4;
	}

	public ArrayList<Integer> getSuccessi5() {
		return successi5;
	}

	public ArrayList<Integer> getSuccessi6() {
		return successi6;
	}

	public void gioca() {
		
		int r1 = d1.lanciaDado();
		int r2 = d2.lanciaDado();
		
		giocate.add("d1: \t" + r1 + "\td2: \t" + r2 );
		
		if (r1 == r2) {
			successi.add(r1);
			
			switch (r1) {
			case 1:
				successi1.add(r1);
				break;
			case 2:
				successi2.add(r1);
				break;
			case 3:
				successi3.add(r1);
				break;
			case 4:
				successi4.add(r1);
				break;
			case 5:
				successi5.add(r1);
				break;
			case 6:
				successi6.add(r1);
				break;
			}
			
		}
		
	}
	
	
	
	
}
