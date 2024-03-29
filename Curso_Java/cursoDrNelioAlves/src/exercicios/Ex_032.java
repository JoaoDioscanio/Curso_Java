package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class Ex_032 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];
		double somAlturas = 0.0;
		int countM = 0;
		for (int i = 0; i < vetor.length; i++) {
			String nome = sc.next();
			short idade = sc.nextShort();
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
			if (vetor[i].idade < 16) {
				countM += 1;
			}
			somAlturas += vetor[i].altura;
		}
		double mediAltura = somAlturas / vetor.length;
		double percentageM = countM * 100.0 / n;
		System.out.printf("Altura média: %.2f\n",mediAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f",percentageM);
		System.out.println("%");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].idade < 16) {
				System.out.println(vetor[i].nome);
			}
		}
		sc.close();
	}

}
