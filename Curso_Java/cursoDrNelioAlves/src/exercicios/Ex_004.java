package exercicios;

/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.
*/
import java.util.Scanner;

public class Ex_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, horasTrabalhadas;
		double salario,salarioPorHora;
		System.out.println("Número do funcionário:");
		n = sc.nextInt();
		sc.nextLine();
		System.out.println("Horas trabalhadas:");
		horasTrabalhadas = sc.nextInt();
		sc.nextLine();
		System.out.println("Salário por hora:");
		salarioPorHora = sc.nextDouble();
		sc.nextLine();
		salario = salarioPorHora * horasTrabalhadas;
		System.out.printf("NÚMERO = %d\nSALÁRIO = R$%.2f",n,salario);
		sc.close();

	}

}
