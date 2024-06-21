package matrizes;

import java.util.Scanner;

public class Aula17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz: ");
		int tamanho = scanner.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for (int l = 0; l < tamanho; l++) {
			for (int c = 0; c < tamanho; c++) {
				System.out.print("Digite o valor para a posição " + l + " " + c + ": ");
				matriz[l][c] = scanner.nextInt(); 
			}
		}
		
		// imprimir os valores da diagonal central
		System.out.println();
		System.out.print("Diagonal central: ");
		
		for (int l = 0; l < tamanho; l++) {
			System.out.print(matriz[l][l] + ", ");
		}
		
		System.out.println();
		System.out.print("Números negativos: ");
		int numNegativos = 0;
		for (int l = 0; l < tamanho; l++) {
			for (int c = 0; c < tamanho; c++) {
				if (matriz[l][c] < 0) {
					System.out.print(matriz[l][c] + ", ");
					numNegativos++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de números negativos: " + numNegativos);
		
		scanner.close();
	}

}
