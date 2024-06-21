package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = scanner.nextInt();
		
		while (num > 10) {
			System.out.printf("A quantidade máxima de valores é 10. Digite novamente: ");
			num = scanner.nextInt();
		}
		
		int[] array = new int[num];
		int[] numNegativos = new int[num];
		int contadorNegativos = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite um número: ");
			array[i] = scanner.nextInt();
			if (array[i] < 0) {
				numNegativos[contadorNegativos] = array[i];
				contadorNegativos++;
			}
		}
		
		System.out.println("Números negativos: ");
		for(int i = 0; i < contadorNegativos; i++) {
			System.out.println(numNegativos[i]);			
		}
		
		scanner.close();
	}

}