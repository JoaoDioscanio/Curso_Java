package aulas;
import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		double v = 1.42156518;
		int x = 32;
		String anoDisputa = "2024";
		
		// %n ou \n = quebra de linha
		// Locale.setDefault(Locale.US) muda de vírgula para ponto
		
		System.out.printf("%.2f%n", v);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n", v);
		System.out.println(x);
		System.out.println("Bom dia!");
		
		// Concatenar com printf %d = int %f = float %s = texto
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", v);
		System.out.printf("RESULTADO = %d metros%n", x);
		System.out.printf("Esses foram os resultados dos jogos Olímpicos %s!\n\n\n\n", anoDisputa);
		
		float salario = 4150;
		String nome = "Duda";
		byte idade = 23;
		
		System.out.printf("%s tem %d anos e tem o salário de RS%.2f\n\n\n\n", nome, idade, salario);
		
		// Exercício de fixação
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		// ITALY também usa vírgula assim como o Brasil
		
		Locale.setDefault(Locale.ITALY);
		System.out.printf("Products:\n%s, which price is $ %.2f\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %f\n", measure);
		System.out.printf("Rounded (three decimal plates):%.3f\n" , measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f\n" , measure);

	}

}
