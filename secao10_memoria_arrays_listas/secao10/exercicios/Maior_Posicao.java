package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// declaração da quantidade de números a serem utilizados
		System.out.printf("Quantos números você vai digitar? ");
		int numeros = scanner.nextInt();
		
		// declaração do array
		int[] array = new int[numeros];
		
		// percorrendo e populando o array
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = scanner.nextInt();
		}
		
		// achando o maior número do array e guardando sua posição
		int maiorNumero = array[0];
		int posicaoMaiorNum = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maiorNumero) {
				maiorNumero = array[i];
				posicaoMaiorNum = i;
			}
		}
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Posição maior número: " + posicaoMaiorNum);
		scanner.close();
	}

}
