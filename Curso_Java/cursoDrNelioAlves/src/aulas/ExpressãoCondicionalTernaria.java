package aulas;

public class ExpressãoCondicionalTernaria {

	public static void main(String[] args) {
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		// Sintaxe: (Condição) ? valor_se_verdadeiro : valor_se_falso
		
		System.out.printf("O desconto é de %.2f",desconto);
		
		double taxa = -1;
		desconto = (desconto*taxa>1) ? desconto += 1 : desconto - 1;
		System.out.printf("Desconto é %.2f", desconto);
	}

}
