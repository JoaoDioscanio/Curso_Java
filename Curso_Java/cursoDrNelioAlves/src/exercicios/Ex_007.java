package exercicios;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;
public class Ex_007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Este número é negativo!");
		}
		else {
			System.out.println("Este número é positivo!");
		}
		sc.close();

	}

}
