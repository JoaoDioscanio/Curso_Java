package aulas;

import java.util.Scanner;
public class EstruturaRepetitivaFor {

	public static void main(String[] args) {
		/* Sintaxe
		for (inicio; condição; incremento) {
			comando 1
			comando 2
		}
		*/
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int soma = 0;
		// i ++ é i + 1
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		// Contagem
		for (int a = 0;a < N; a++) {
			System.out.println("Valor de a: "+a);
		}
		sc.close();

	}

}
