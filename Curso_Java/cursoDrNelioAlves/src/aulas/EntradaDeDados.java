package aulas;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String x;
		System.out.println("Digite seu nome:");
		x = ler.next();
		System.out.println("Você digitou: " +x);
		
		int y;
		System.out.println("Digite um número inteiro");
		y = ler.nextInt();

		System.out.printf("Você digitou %d\n", y );
		
		double z;
		System.out.println("Digite um número flutuante:");
		z = ler.nextDouble();
		System.out.println("Você digitou: "+z);
		
		char r;
		System.out.println("Digite uma letra:");
		r = ler.next().charAt(0);
		System.out.println("Você digitou: "+r);
		
		// .nextLine() para ler a linha
		
		String a, b, c;
		int d;
		d = ler.nextInt();
		// Ao usar o nextInt() uma linha é quebrada, para isso use um scanner.nextLine sem valor
		ler.nextLine();
		a = ler.nextLine();
		b = ler.nextLine();
		c = ler.nextLine();
		System.out.printf("%d\n%s\n%s\n%s",d,a,b,c);
		
		
		ler.close();

	}

}
