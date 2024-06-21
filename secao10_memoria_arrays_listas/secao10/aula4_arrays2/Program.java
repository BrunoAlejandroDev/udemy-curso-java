package aula4_arrays2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		Product[] array = new Product[n];
		double sum = 0.0;
		
		for(int i = 0; i < array.length; i++) {
			scanner.nextLine();
			
			System.out.printf("Insira o nome do produto: ");
			String name = scanner.nextLine();
			System.out.printf("Insira o valor do produto: ");
			double price = scanner.nextDouble();
			
			array[i] = new Product(name, price);
			sum += array[i].getPrice();
		}
		System.out.printf("Soma dos valores dos produtos: %.2f\n", sum);
		System.out.printf("Média dos valores dos produtos: %.2f", sum / array.length);
		
		scanner.close();
	}

}
