package exercicios;
/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
com uma mensagem explicativa
 */

import java.util.Scanner;

public class Ex_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, soma;
		System.out.println("Digite um número inteiro:");
		n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite outro número inteiro:");
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("SOMA = "+soma);
		sc.close();

	}

}