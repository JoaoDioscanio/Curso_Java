package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.ConvertorMoeda;
public class Ex_028 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double d = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double qtD = sc.nextDouble();
		double total = ConvertorMoeda.total(d, qtD);
		System.out.printf("Amount to be paid in R$ %.2f",total);
		sc.close();
	}

}
