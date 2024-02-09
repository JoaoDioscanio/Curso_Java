package exercicios;

import java.util.Scanner;
import entidades.Retangulo;
import java.util.Locale;
public class Ex_025 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo rectangle;
		rectangle = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		double area, perimeter, diagonal;
		area = rectangle.area();
		perimeter = rectangle.perimetro();
		diagonal = rectangle.diagonal();
		System.out.printf("AREA = %.2f\nPERIMETER = %.2f\nDIAGONAL = %.2f",area,perimeter,diagonal);
		
		sc.close();

	}

}
