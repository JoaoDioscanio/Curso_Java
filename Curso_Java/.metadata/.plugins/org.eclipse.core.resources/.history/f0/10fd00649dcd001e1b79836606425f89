package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n",(i+1));
			sc.nextLine();
			nome[i] = sc.nextLine();
			double _1nota = sc.nextDouble();
			double _2nota = sc.nextDouble();
			nota[i] = _1nota + _2nota;
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if (nota[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		sc.close();

	}

}
