package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		    String L1 = sc.next();

		if (L1.equalsIgnoreCase("A") || L1.equalsIgnoreCase("E") || L1.equalsIgnoreCase("I") || L1.equalsIgnoreCase("O")
				|| L1.equalsIgnoreCase("U")) {
			  System.out.printf("Vogal");
		} else {
			  System.out.println("Consoante");
		}

		sc.close();

	}

}
