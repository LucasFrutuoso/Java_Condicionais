package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nota 1: ");
			double nota1 = sc.nextDouble();			
		System.out.println("Nota 2: ");
			double nota2 = sc.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			
			if(media >= 7 && media <= 9) {
				System.out.println("APROVADO!\nNOTA: " + media);
			}else if(media == 10) {
				System.out.println("APROVADO COM DISTINÇÃO!\nNOTA: " + media);
			}else if(media< 7){
				System.out.println("REPROVADO!\nNOTA: " + media);
			}else {
				System.out.println("Invalido!");
			}
			
		sc.close();

	}

}
