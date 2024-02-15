package exercicios;

import java.util.Scanner;

public class Ex_033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int count = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("NÚMEROS PARES:"); 
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i]+" ");
			}
		}
		System.out.println("\nQUANTIDADE DE PARES = "+count);
		sc.close();

	}

}
