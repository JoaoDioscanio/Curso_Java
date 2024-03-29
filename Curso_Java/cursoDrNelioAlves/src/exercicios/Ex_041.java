package exercicios;

import java.util.Scanner;

public class Ex_041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ler número de linhas e colunas
		final int l = sc.nextInt();
		final int c = sc.nextInt();
		// Inicializar matriz
		int[][] matriz = new int[l][c];
		for (int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		// Ler um valor
		int x = sc.nextInt();
		// Comparar com a matriz
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				if (x == matriz[i][j]) {
					// Mostrar posição
					System.out.println("Posição "+ i + ","+ j+":");
					// Mostrar valores à esquerda
					if (j > 0) {
						System.out.println("Left: "+matriz[i][j-1]);
					}
					// Mostrar valores à direita
					if (matriz[i].length-1 > j) {
						System.out.println("Right: "+matriz[i][j+1]);
					}
					// Mostrar valores acima
					if (i > 0) {
						System.out.println("Up: "+matriz[i-1][j]);
					}
					// Mostrar valores abaixo
					if (matriz.length-1 > i) {
						System.out.println("Down: "+matriz[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}

}
