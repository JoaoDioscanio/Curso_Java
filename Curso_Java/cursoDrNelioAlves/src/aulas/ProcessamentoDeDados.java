package aulas;

public class ProcessamentoDeDados {

	public static void main(String[] args) {
		int x;
		double y;
		x = 5;
		y = 2 * x;

		System.out.println(x);
		System.out.println(y);
		
		// Área do trapézio
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b+B)*h/2;
		System.out.println("Área = " + area + "m²" );
		
		// Exemplos de Casting
		
		int a, c;
		double resultado;
		a = 5;
		c = 2;
		resultado = (double) a / c;
		System.out.println(resultado);
		
		double r;
		int s;
		r = 2.0;
		s = (int) r;
		System.out.println(s);

	}

}
