package aulas;

import java.util.Scanner;

import entidades.Estudante;

public class DesafioPensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante[] room = new Estudante[10];
		System.out.print("How many rooms will be rented: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #"+(i+1));
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Email: ");
			String mail = sc.next();
			System.out.print("Room: ");
			int roomEmpty = sc.nextInt();
			room[roomEmpty] = new Estudante(name, mail, roomEmpty);
			
		}
		
		sc.close();

	}

}
