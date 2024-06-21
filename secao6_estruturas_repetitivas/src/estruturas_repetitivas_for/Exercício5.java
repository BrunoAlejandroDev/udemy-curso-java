package estruturas_repetitivas_for;

import java.util.Scanner;
import java.util.Locale;

public class Exercício5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int numero = sc.nextInt();
		int fatorial = numero;
		
		for (int i = 1; i < numero; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		
		sc.close();
	}

}
