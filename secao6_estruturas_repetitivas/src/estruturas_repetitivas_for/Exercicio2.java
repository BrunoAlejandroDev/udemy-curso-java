package estruturas_repetitivas_for;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		
		System.out.println("Digite um valor para o contador");
		int limite = sc.nextInt();
		
		for (int i = 0; i < limite; i++) {
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		System.out.println("Valores dentro do intervalo: " + in);
		System.out.println("Valores fora do intervalo: " + out);
		
		sc.close();
	}

}
