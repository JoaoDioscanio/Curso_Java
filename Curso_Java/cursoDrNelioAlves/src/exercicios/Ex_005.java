package exercicios;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
*/

import java.util.Scanner;
public class Ex_005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tag1, tag2, nP1, nP2;
		double vUnitario1, vUnitario2, total;
		System.out.println("Código peça 1:");
		tag1 = sc.nextInt();
		System.out.println("Valor unitário da peça 1:");
		vUnitario1 = sc.nextDouble();
		System.out.println("Número de peças 1:");
		nP1 = sc.nextInt();
		System.out.println("Código peça 2:");
		tag2 = sc.nextInt();
		System.out.println("Valor unitário da peça 2:");
		vUnitario2 = sc.nextDouble();
		System.out.println("Número de peças 2:");
		nP2 = sc.nextInt();
		total = vUnitario1 * nP1 + vUnitario2 * nP2;
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
		System.out.printf("CÓDIGO: %d e %d",tag1,tag2);
		sc.close();

	}

}
