package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entidades.Funcionarios;
public class Ex_026 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionarios f1 = new Funcionarios();
		System.out.println("Employee 1:");
		System.out.print("Name: ");
		f1.nome = sc.next();
		System.out.print("Gross salary: ");
		f1.SalarioBruto = sc.nextDouble();
		System.out.print("Tax: ");
		f1.Imposto = sc.nextDouble();
		System.out.println("Employee: " +f1);
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		f1.AumentarSalario(percentage);
		System.out.println("\nUpdated data: " +f1);
		sc.close();
	}

}
