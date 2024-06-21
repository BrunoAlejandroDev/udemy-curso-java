package estruturas_repetitivas_for;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor para o número de casos de teste");
		int contador = sc.nextInt();
		
		for (int i = 0; i < contador; i++) {
			System.out.println("Digite o primeiro valor:");
			double valor1 = sc.nextDouble();
			
			System.out.println("Digite o segundo valor:");
			double valor2 = sc.nextDouble();
			
			System.out.println("Digite o terceiro valor:");
			double valor3 = sc.nextDouble();
			
			double mediaPonderada = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;
			System.out.printf("A média dos valores é: %.1f\n", mediaPonderada);
		}
		
		sc.close();
	}

}
