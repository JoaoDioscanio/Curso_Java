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
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Dados da %dª pessoa:\n",(i+1));
			System.out.print("Nome: ");
			String nome = sc.next();
			
			System.out.print("Idade: ");
			byte idade = sc.nextByte();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		double somaAlturas = 0.0;
		int countDeMenor = 0;
		for (int i = 0; i < vetor.length; i++) {
			somaAlturas += vetor[i].getAltura();
			byte idade = vetor[i].getIdade();
			if (idade < 16) {
				countDeMenor += 1;
			}
		}
		double percentageMinors = countDeMenor/n*100;
		System.out.printf("Altura média: %.2f\n",(somaAlturas/vetor.length));
		System.out.printf("Pessoas com menos de 16 anos: %.1f\n",percentageMinors);
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getName());
			}
		}
		sc.close();
	}

}
