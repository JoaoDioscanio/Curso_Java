package aulas;

public class EscopoEInicializacao {
	private static double discountglobal;
	
	public static void main(String[] args) {
		double preco = 150.00;
		
		if (preco < 200.0) {
			discountglobal = preco * 0.05;
		}
		// Caso essa variavel não fosse global ela não seria inicializada nesse escopo
		System.out.println(discountglobal);

	}

}
