package exercicios;

/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de 
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com 
duas casas decimais.
*/
import java.util.Scanner;
public class Ex_014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario, taxRendaG1, taxRendaG2, taxRendaG3, impRenda;
		taxRendaG1 = 0.08;
		taxRendaG2 = 0.18;
		taxRendaG3 = 0.28;
		
		System.out.println("Salário:");
		salario = sc.nextDouble();
		while (salario < 0) {
			System.out.println("Valor inválido, digite novamente:");
			salario = sc.nextDouble();
		}
		if (salario > 2000 && salario <= 3000) {
			impRenda = (salario - 2000) * taxRendaG1;
			System.out.printf("R$ %.2f", impRenda);
		}
		else if (salario > 3000 && salario <= 4500) {
			impRenda = (salario - 3000) * taxRendaG2 + (1000 * taxRendaG1);
			System.out.printf("R$ %.2f", impRenda);
		}
		else if (salario > 4500) {
			impRenda = (1000 * taxRendaG1) + (1500 * taxRendaG2) + ((salario - 4500) * taxRendaG3);
			System.out.printf("R$ %.2f", impRenda);
		}
		else {
			System.out.println("Isento");
		}
		sc.close();

	}

}
