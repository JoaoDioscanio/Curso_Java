package exercicios;

import java.util.Scanner;
import java.util.Locale;
import entidades.Aluno;
public class Ex_027 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno a1 = new Aluno();
		a1.nome = sc.next();
		a1.trimestre1 = sc.nextDouble();
		a1.trimestre2 = sc.nextDouble();
		a1.trimestre3 = sc.nextDouble();
		a1.analise();
		
		sc.close();
	}

}
