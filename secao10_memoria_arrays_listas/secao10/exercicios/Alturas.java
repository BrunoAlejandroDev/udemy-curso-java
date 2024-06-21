package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// inserir a quantidade de pessoas que serão utilizadas no exercício
		System.out.print("Quantas pessoas serão digitadas? ");
		int quantPessoas = 0;
		while (quantPessoas <= 0) {
			System.out.print("Quantas pessoas serão digitadas? ");
			quantPessoas = scanner.nextInt();			
		}
		
		// declarações de arrays
		String[] nome = new String[quantPessoas];
		int[] idade = new int[quantPessoas];
		double[] altura = new double[quantPessoas];
		
		// percorrendo e populandos os arrays
		for(int i = 0; i < quantPessoas; i++) {
			scanner.nextLine();
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			nome[i] = scanner.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = scanner.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = scanner.nextDouble();
		}
		
		// exibir a altura média das pessoas
		double alturaTotal = 0;
		for(int i = 0; i < altura.length; i++) {
			alturaTotal += altura[i];
		}
		double alturaMedia = alturaTotal / quantPessoas;
		System.out.printf("Altura média: %.2f\n", alturaMedia);
		
		// exibir o percentual de pessoas com menos de 16 anos
		double menoresDe16 = 0;
		for(int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				menoresDe16++;
			}
		}
		double percentualMenores = (menoresDe16 / quantPessoas) * 100.0;
		System.out.printf("Percentual de pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		// exibir nome das pessoas com menos de 16 anos
		if (menoresDe16 > 0) {
			for(int i = 0; i < idade.length; i++) {
				if (idade[i] < 16) {
					System.out.println(nome[i]);
				}
			}
		} else {
			System.out.println("Não há pessoas menores de 16 anos.");
		}
		
		scanner.close();
	}

}