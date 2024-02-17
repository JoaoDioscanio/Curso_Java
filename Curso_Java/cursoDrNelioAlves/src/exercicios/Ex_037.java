package exercicios;

import java.util.Scanner;

public class Ex_037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:\n",(i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		int maiorIdade = idade[0];
		int posicaoMaior = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: "+nome[posicaoMaior]);
		sc.close();
	}

}
