package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// declarando a variável de tamanho
		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanho = scanner.nextInt();
		
		// declarando o array
		int[] array = new int[tamanho];
		
		// percorrendo e populando o array
		for(int i = 0; i < tamanho; i++) {
			array[i] = scanner.nextInt();
		}
		
		// verificando se existem pares
		int quantPares = 0;
		double somaPares = 0;
		for(int i = 0; i < tamanho; i++) {
			if (array[i] % 2 == 0) {
				somaPares += array[i];
				quantPares++;
			}
		}
		
		// calculando a média dos números pares
		double mediaPares = 0;
		if (quantPares == 0) {
			System.out.println("Não há números pares.");
		}else {
			mediaPares = somaPares / quantPares;
			System.out.printf("Média dos números pares: %.1f", mediaPares);
		}
		scanner.close();
	}

}
