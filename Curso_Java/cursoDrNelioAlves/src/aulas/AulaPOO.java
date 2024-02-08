package aulas;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;

public class AulaPOO {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaX = x.area();
		double areaY = y.area();
		System.out.println(areaX);
		System.out.println(areaY);
		sc.close();
}
}