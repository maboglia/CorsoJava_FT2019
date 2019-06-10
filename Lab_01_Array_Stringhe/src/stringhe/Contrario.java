package stringhe;

import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();

		for (int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
