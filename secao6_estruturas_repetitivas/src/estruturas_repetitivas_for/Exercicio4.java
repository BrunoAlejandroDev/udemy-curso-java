package estruturas_repetitivas_for;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o contador");
		int contador = sc.nextInt();
		
		for (int i = 0; i < contador; i++) {
			System.out.println("Digite o primeiro número:");
			double valor1 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = sc.nextDouble();
						
			if (valor2 == 0) {
			System.out.println("Divisão impossível");
			}
			else {
				double divisao = valor1 / valor2;
				System.out.println("O resultado da divisão foi: " + divisao);
			}
		}
		
		sc.close();
	}

}
