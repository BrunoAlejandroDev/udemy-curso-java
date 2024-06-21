package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_Da_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int tamanho = scanner.nextInt();
		
		// declaração do vetor
		double[] array = new double[tamanho];
		
		// percorrendo e populando o array
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = scanner.nextDouble();
		}
		
		// calcular a média
		double valorTotal = 0;
		for(int i = 0; i < array.length; i++) {
			valorTotal += array[i];
		}
		double mediaVetor = valorTotal / tamanho;
		System.out.printf("Média do vetor = %.3f\n", mediaVetor);
		
		// exibir elementos abaixo da média
		for(int i = 0; i < array.length; i++) {
			if(array[i] < mediaVetor) {
				System.out.printf("%.1f\n", array[i]);
			}
		}
		scanner.close();
	}

}
