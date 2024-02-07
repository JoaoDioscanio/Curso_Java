package exercicios;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem divisao impossivel.
*/
import java.util.Scanner;
public class Ex_021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a, b;
		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 || b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = (double) a / b;
				System.out.println(divisao);
			}
		}
		sc.close();

	}

}
