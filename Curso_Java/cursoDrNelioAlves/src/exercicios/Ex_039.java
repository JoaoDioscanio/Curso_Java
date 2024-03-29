package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_039 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		char[] genero = new char[n];
		double[] altura = new double[n];
		double maiorAltura = altura[0];
		
		double somaF = 0.0;
		int countM = n;
		for (int i = 0; i < n; i++) {
			System.out.printf("Gênero da %dª pessoa: ",i+1);
			genero[i] = sc.next().charAt(0);
			System.out.printf("Altura da %dª pessoa: ",i+1);
			altura[i] = sc.nextDouble();
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
			if (genero[i] == 'F') {
				somaF += altura[i];
				countM -= 1;
			}
		}
		double menorAltura = maiorAltura;
		for (int i = 0; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		System.out.printf("Menor altura = %.2f\n",menorAltura);

		System.out.printf("Maior altura = %.2f\n",maiorAltura);

		System.out.printf("Média de altura das mulheres = %.2f\n",somaF/(n-countM));

		System.out.printf("Número de homens = %d\n",countM);
		sc.close();
	}

}
