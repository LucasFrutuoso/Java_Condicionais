package exercicios;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
			int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
			int n2 = sc.nextInt();
			
			if(n1 > n2) {
			System.out.printf("%d é maior que %d", n1, n2);	
			}else {
				System.out.printf("%d é maior que %d", n2, n1);
			}
			

		sc.close();

	}

}
