package exercicios;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Multiplos" ou "Não são 
Múltiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
ordem crescente ou decrescente.
*/
import java.util.Scanner;
public class Ex_009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		System.out.println("Digite um número inteiro:");
		A = sc.nextInt();
		System.out.println("Digite outro número inteiro:");
		B = sc.nextInt();
		if ((A % B) == 0 || (B % A) == 0){
			System.out.println("SÃO MÚLTIPLOS");
		}
		else {
			System.out.println("NÃO SÃO MÚLTIPLOS");
		}
		sc.close();
	}

}
