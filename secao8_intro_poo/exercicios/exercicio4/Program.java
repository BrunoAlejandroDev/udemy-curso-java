package exercicio4;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotação do dólar: ");
		double cotacaoDolar = sc.nextDouble();
		
		System.out.print("Quantos dólares você quer comprar: ");
		double dolares = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(cotacaoDolar, dolares);
		
		System.out.printf("Quantidade a ser paga em reais: %.2f", result);
		
		sc.close();
	}

}
