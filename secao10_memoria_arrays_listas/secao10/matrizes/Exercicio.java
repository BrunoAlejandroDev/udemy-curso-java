package matrizes;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de linhas da matriz: ");
		int linhas = scanner.nextInt();
		
		System.out.print("Digite o número de colunas da matriz: ");
		int colunas = scanner.nextInt();
		
		int [][] matriz = new int[linhas][colunas];
		
		
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				System.out.print("Digite o valor para a posição " + linha + " " + coluna + ": ");
				matriz[linha][coluna] = scanner.nextInt();
			}
		}
		
		System.out.print("Digite um número para ser buscado na matriz: ");
		int numeroMatriz = scanner.nextInt();
		
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				if (matriz[linha][coluna] == numeroMatriz) {
					System.out.println("Posição [" + linha + ", " + coluna + "]: ");
					if (linha > 0) {
						System.out.println("Topo: " + matriz[linha-1][coluna]);
					}
					if (coluna < matriz[linha].length-1) {
						System.out.println("Direita: " + matriz[linha][coluna+1]);
					}
					if (linha < matriz.length-1) { 
						System.out.println("Baixo: " + matriz[linha+1][coluna]);
					}
					if (coluna > 0) {
						System.out.println("Esquerda: " + matriz[linha][coluna-1]);
					}
				}
			}
		}
		
		scanner.close();
	}

}
