package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int countP = 0;
		int somaP = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				countP += 1;
				somaP += num;
			}
			vetor[i] = num;
		}
		if (countP != 0) {
			double media = somaP / countP;
			System.out.printf("MÉDIA DOS PARES %.1f",media);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		sc.close();

	}

}
