package estruturas_repetitivas_while;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para a coordenada X");
		int x = sc.nextInt();
		
		System.out.println("Digite um valor para a coordenada Y");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			}
			else {
				System.out.println("Quarto quadrante");
			}
			System.out.println("Digite um valor para a coordenada X");
			x = sc.nextInt();
			
			System.out.println("Digite um valor para a coordenada Y");
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
