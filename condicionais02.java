package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
			int n1 = sc.nextInt();
		
			
			if(n1 > 0) {
			System.out.printf("%d é positivo", n1);	
			}else {
				System.out.printf("%d é negativo", n1);
			}
			

		sc.close();

	}

}
