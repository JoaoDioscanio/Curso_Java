package exercicios;

import java.util.Scanner;

public class Ex_011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TABELA
		double p1, p2, p3, p4, p5, total;
		p1 = 4.00;
		p2 = 4.50;
		p3 = 5.00;
		p4 = 2.00;
		p5 = 1.50;
		
		System.out.println("Escolha um item da tabela:");
		int tag = sc.nextInt();
		while (tag < 1 || tag > 5) {
			System.out.println("Código inválido, digite novamente:");
			tag = sc.nextInt();
		}
		System.out.println("Quantidade:");
		int qtd = sc.nextInt();
		while (qtd <= 0) {
			System.out.println("Quantidade inválida, digite novamente:");
			qtd = sc.nextInt();
		}
		if (tag == 1) {
			total = p1 * qtd;
			System.out.printf("Total: R$ %.2f",total);
		}
		if (tag == 2) {
			total = p2 * qtd;
			System.out.printf("Total: R$ %.2f",total);
		}
		if (tag == 3) {
			total = p3 * qtd;
			System.out.printf("Total: R$ %.2f",total);
		}
		if (tag == 4) {
			total = p4 * qtd;
			System.out.printf("Total: R$ %.2f",total);
		}
		if (tag == 5) {
			total = p5 * qtd;
			System.out.printf("Total: R$ %.2f", total);
		}
		sc.close();
	}

}
