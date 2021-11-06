package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		  String L1 = sc.next();
			
			if(L1.equalsIgnoreCase("F")) {
			    System.out.printf("Feminino");	
			}else if (L1.equalsIgnoreCase("M")){
				  System.out.printf("Masculino");
			}else {
				System.out.println("Sexo inválido");
			}
			

		sc.close();

	}

}
