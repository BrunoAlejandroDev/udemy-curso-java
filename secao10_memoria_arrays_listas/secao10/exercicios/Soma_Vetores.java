package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Quantos valores vai ter cada vetor? ");
		int tamanho = scanner.nextInt();
		
		// declaração dos vetores
		int[] array1 = new int[tamanho];
		int[] array2 = new int[tamanho];
		int[] array3 = new int[tamanho];
		
		// percorrendo e populando o vetor 1
		System.out.println("Digite o(s) valores para o primeiro array: ");
		for(int i = 0; i < tamanho; i++) {
			array1[i] = scanner.nextInt();
		}
		
		System.out.println("Digite o(s) valores para o primeiro array: ");
		for(int i = 0; i < tamanho; i++) {
			array2[i] = scanner.nextInt();
		}
		
		System.out.println("Vetor resultante: ");
		for(int i = 0; i < tamanho; i++) {
			array3[i] = array1[i] + array2[i];
			System.out.println(array3[i]);
		}
		scanner.close();
	}

}
