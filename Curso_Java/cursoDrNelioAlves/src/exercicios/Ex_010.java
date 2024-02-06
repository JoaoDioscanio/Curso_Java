package exercicios;

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
import java.util.Scanner;
public class Ex_010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora inicial:");
		int hInit = sc.nextInt();
		System.out.println("Digite a hora final:");
		int hFin = sc.nextInt();
		if (hInit == hFin) {
			System.out.println("O JOGO DUROU 24 HORAS");
		}
		else if (hInit > hFin) {
			System.out.printf("O JOGO DUROU %d HORAS",(24-(hInit-hFin)));
		}
		else {
			System.out.printf("O JOGO DUROU %d HORA(S)",(hFin-hInit));
		}
		sc.close();

	}

}
