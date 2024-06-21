package aula3_arrays1;

import java.util.Locale;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// declarações
		double sum = 0.0;
		System.out.print("Insira o tamanho do array: ");
		int n = scanner.nextInt(); // variável para inserir o tamanho do array
		
		// declarando um array
		double[] vect = new double[n];
		
		// percorrendo o array e inserindo valores
		for(int i = 0; i < n; i++) {
			// usando scanner para colocar os valores no array
			System.out.println("Insira o valor para a posição " + i);
			vect[i] = scanner.nextDouble();
			sum += vect[i];
		}
		
		double media = sum / n;
		System.out.printf("Media: %.2f", media);
		
		scanner.close();
	}

}
