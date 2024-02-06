package aulas;

import java.util.Scanner;
public class OperadoresDeAtribuicaoCumulativa {

	public static void main(String[] args) {
		/* A += B = A = A + B
		A -= B = A = A - B
		A *= B = A = A * B
		A /= B = A = A / B
		A %= B = A = A % B
		*/
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
		conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();
	}

}
