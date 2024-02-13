package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.Banco;

public class Ex_029 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Aplicação do Cadastro
		System.out.print("Enter account number: ");
		long tagAccount = sc.nextLong();
		System.out.print("Enter account holder: ");
		String nameHolder = sc.next();
		Banco holder = new Banco(tagAccount, nameHolder);
		String nameT = holder.getNomeTitular();
		System.out.println(nameT);
		long tag = holder.getTagConta();
		System.out.println(tag);
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initDeposit = sc.nextDouble();
			holder.setSaldoTitular(initDeposit);
			System.out.printf("Account data:\nAccount %d, Holder: %s, Balance: $ %.2f",tag, nameT, initDeposit);
		}
		
		
		
		
		sc.close();
	}

}