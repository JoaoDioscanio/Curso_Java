package exercicios;

/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não
estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
*/
import java.util.Scanner;
public class Ex_012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor qualquer:");
		double nUser = sc.nextDouble();
		if (nUser >= 0 && nUser <= 25) {
			System.out.println("Intervalo [0; 25]");
		}
		if (nUser > 25 && nUser <= 50) {
			System.out.println("Intervalo (25; 50]");
		}
		if (nUser > 50 && nUser <= 75) {
			System.out.println("Intervalo (50; 75]");
		}
		if (nUser > 75 && nUser <= 100) {
			System.out.println("Intervalo (75; 100]");
		}
		if (nUser < 0 || nUser > 100) {
			System.out.println("Fora de intervalo");
		}
		sc.close();

	}

}
