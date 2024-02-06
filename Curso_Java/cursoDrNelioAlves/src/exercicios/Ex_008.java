package exercicios;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;
public class Ex_008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int n = sc.nextInt();
		if ((n % 2) == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		sc.close();

	}

}
