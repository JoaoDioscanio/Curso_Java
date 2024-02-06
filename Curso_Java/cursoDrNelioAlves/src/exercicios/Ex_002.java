package exercicios;

/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste
círculo com quatro casas decimais. 
*/

// Considere o valor de π = 3.14159

import java.util.Scanner;

public class Ex_002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi, raio, area;
		pi = Math.PI;
		System.out.println("Raio: ");
		raio = sc.nextDouble();
		area = pi*(Math.pow(raio,2));
		System.out.printf("Área do círculo é de %.3f",area);
		sc.close();
		

	}

}
