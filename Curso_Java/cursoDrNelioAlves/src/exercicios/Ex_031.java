package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_031 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números vai digitar: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ",vetor[i]);
		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		System.out.printf("\nSOMA = %.1f\n",soma);
		System.out.printf("MÉDIA = %.1f",(soma/vetor.length));
		sc.close();
	}

}
