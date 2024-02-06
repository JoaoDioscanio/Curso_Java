package aulas;

import java.util.Scanner;
public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int x = sc.nextInt();
		int soma = 0;
		while (x != 0) {
			soma += x;	
			System.out.println("Digite um número inteiro:");
			x = sc.nextInt();
		}
		sc.close();
		System.out.println(soma);
	}

}
