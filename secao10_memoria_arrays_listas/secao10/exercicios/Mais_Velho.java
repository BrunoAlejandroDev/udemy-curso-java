package exercicios;

import java.util.Scanner;

public class Mais_Velho {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// variável para guardar tamanho do array
		System.out.print("Quantas pessoas você vai digitar? ");
		int tamanho = scanner.nextInt();
		
		// criando os arrays
		String[] arrayNomes = new String[tamanho];
		int[] arrayIdades = new int[tamanho];
		
		// percorrendo e populando os array
		for(int i = 0; i < tamanho; i++) {
			scanner.nextLine();
			System.out.println("Dados da " + (i+1) + "ª" + " pessoa");
			System.out.print("Nome: ");
			arrayNomes[i] = scanner.nextLine();
			System.out.print("Idade: ");
			arrayIdades[i] = scanner.nextInt();
		}
		
		String pessoaMaisVelha = "";
		int maiorIdade = 0;
		for(int i = 0; i < tamanho; i++) {
			if(arrayIdades[i] > maiorIdade) {
				maiorIdade = arrayIdades[i];
				pessoaMaisVelha = arrayNomes[i];
			}
		}
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
		
		scanner.close();
	}

}