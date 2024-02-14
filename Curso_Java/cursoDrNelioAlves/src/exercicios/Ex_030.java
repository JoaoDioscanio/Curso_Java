package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_030 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		while (n > 10 || n < 1) {
			System.out.print("Valor inválido, digite novamente: ");
			n = sc.nextInt();
		}
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	} 

}
