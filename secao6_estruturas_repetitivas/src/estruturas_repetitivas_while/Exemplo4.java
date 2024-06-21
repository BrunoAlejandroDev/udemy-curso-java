package estruturas_repetitivas_while;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaAlcool = 0;
		int somaGasolina = 0;
		int somaDiesel = 0;
		
		System.out.println("Qual o combustível que você usou para abastecer? "
				+ "Digite 1 para ÁLCOOL, "
				+ "2 para GASOLINA, "
				+ "3 para DIESEL "
				+ "e 4 para SAIR");
		int escolha = sc.nextInt();
		
		while (escolha != 4) {
			if (escolha < 1 || escolha > 4) {
				System.out.println("Número inválido. 1 para ÁLCOOL, 2 para GASOLINA, 3 para DIESEL, 4 para SAIR");
				escolha = sc.nextInt();
			}
			else {
				if (escolha == 1) {
					somaAlcool += 1;
				}
				else if (escolha == 2) {
					somaGasolina += 1;
				}
				else if (escolha == 3){
					somaDiesel += 1;
				}
			}
			escolha = sc.nextInt();
		}
		
		System.out.println("Muito obrigado");
		System.out.println("Álcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);
		
		sc.close();
	}

}
