package entities;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//leitura das dimensoes da matriz
		System.out.println("Digite o numero de linhas: ");
		int linhas = sc.nextInt();
		System.out.println("Digite o numero de colunas: ");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		// leitura dos valores da matriz
		System.out.println("Digite os valores da Matriz: ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i] [j] = sc.nextInt();
				
			}
		}
       
		//numero a ser buscado
		System.out.print("Digite um numero a ser procurado : ");
		int numero = sc.nextInt();
		
		// Procurar o numero na matriz
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] == numero) {
					System.out.println("Posicao " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j - 1]);
					}
					if (j < colunas - 1) {
						System.out.println("Right: " + matriz[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i - 1][j]);
					}
					if (i < linhas -1) {
						System.out.println("Down: " + matriz[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}


