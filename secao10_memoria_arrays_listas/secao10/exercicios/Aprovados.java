package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		// variável para guardar tamanho do array
		System.out.print("Quantas alunos você vai digitar? ");
		int tamanho = scanner.nextInt();
		
		// declaração dos arrays
		String[] arrayNomes = new String[tamanho];
		double[] arrayNotas1 = new double[tamanho];
		double[] arrayNotas2 = new double[tamanho];
		
		// percorrendo e populando os arrays
		for(int i = 0; i < tamanho; i++) {
			scanner.nextLine();
			System.out.println("Digite o nome, a primeira e a segunda nota para o " + (i+1) + "°" + " aluno");
			System.out.print("Nome: ");
			arrayNomes[i] = scanner.nextLine();
			
			System.out.print("Primeira nota: ");
			arrayNotas1[i] = scanner.nextDouble();
			
			System.out.print("Segunda nota: ");
			arrayNotas2[i] = scanner.nextDouble();
		}
		
		double media = 0;
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < tamanho; i++) {
			double somaNotas = arrayNotas1[i] + arrayNotas2[i];
			media = somaNotas / 2;
			
			if (media >= 6) {
				System.out.println(arrayNomes[i]);
			}			
		}
		scanner.close();
	}

}