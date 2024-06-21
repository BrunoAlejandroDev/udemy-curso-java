package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Numeros_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int quantidadePares = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		int numeros = scanner.nextInt();
		
		int[] array = new int[numeros];
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.print("Números pares:");
		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.printf("%d ", array[i]);
				quantidadePares++;
			}
		}
		System.out.println("\nQuantidade de pares: " + quantidadePares);
		scanner.close();
	}

}
