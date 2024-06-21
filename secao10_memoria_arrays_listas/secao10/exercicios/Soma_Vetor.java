package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int numeros = scanner.nextInt();
		
		int soma = 0;
		int media = 0;
		int[] array = new int[numeros];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = scanner.nextInt();	
			soma += array[i];
			media = soma / array.length;
		}
		
		System.out.print("Valores: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");	
		}
		
		System.out.println();
		System.out.println("Soma dos valores: " + soma);
		System.out.println("Média dos valores: " + media);
		
		scanner.close();
	}

}