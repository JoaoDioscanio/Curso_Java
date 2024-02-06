package exercicios;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo.
*/
import java.util.Scanner;

public class Ex_017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pesquisa = sc.nextInt();
		int count1 = 0, count2 = 0, count3 = 0;
		while (pesquisa != 4) {
			switch (pesquisa) {
			case 1:
				count1 += 1;
				break;
			case 2:
				count2 += 1;
				break;
			case 3:
				count3 += 1;
				break;
			}
			pesquisa = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO\nÁlcool: %d\nGasolina: %d\nDiesel %d",count1,count2,count3);
		sc.close();
		
	}
}
