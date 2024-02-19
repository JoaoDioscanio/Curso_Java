package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Ex_040 {

	public static void main(String[] args) {
		// Exercício lista funcionario e aumentar salario, variaveis tag, nome, salario
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> novaLista = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão digitados? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("FUNCIONÁRIO #%d\n",i+1);
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			Funcionario a = new Funcionario(id, nome, salario);
			novaLista.add(a);
		}
		
		System.out.print("Digite o ID do funcionário que receberá aumento: ");
		int tag = sc.nextInt();
		Integer pos = posicao(novaLista, tag);
		
		if (pos == null) {
			System.out.println("Esse ID não existe!");
		}
		else {
			System.out.print("Digite a porcentagem de aumento: ");
			double porcentagem = sc.nextDouble();
			novaLista.get(pos).aumentarSalario(porcentagem);
		}
		
		System.out.println("Lista de funcionários:");
		System.out.println(novaLista);
		
		sc.close();
	}

	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTag() == id) {
				return i;
			}
		}
		return null;
	}
}
