package exercicios;

/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/

import java.util.Scanner;
public class Ex_019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num, countIn = 0, countOut = 0;
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			if (num < 10 || num > 20) {
				countOut += 1;
			}
			else {
				countIn += 1;
			}
		}
		System.out.printf("%d in\n%d out",countIn, countOut);
		sc.close();
	}

}
