package exercicios;

/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a
diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/
import java.util.Scanner;

public class Ex_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, formula;
		System.out.println("Digite 4 valores inteiros: ");
		A = sc.nextInt();
		sc.nextLine();
		B = sc.nextInt();
		sc.nextLine();
		C = sc.nextInt();
		sc.nextLine();
		D = sc.nextInt();
		formula = A * B - C * D;
		System.out.println("A diferença do produto de A e B pelo produto de C e D é "+formula);
		sc.close();

	}

}
