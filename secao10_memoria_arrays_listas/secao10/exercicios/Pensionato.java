package exercicios;

import java.util.Scanner;

public class Pensionato {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// declaração do vetor de quartos
		Aluguel[] quartos = new Aluguel[10];
		
		System.out.print("Quantos quartos vão ser alugados? ");
		int quantQuartos = scanner.nextInt();

		for (int i = 0; i < quantQuartos; i++) {
			System.out.println();
			scanner.nextLine();
			
			System.out.println("Aluguel #" + (i+1) + ":");
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Email: ");
			String email = scanner.nextLine();
			
			System.out.print("Número do quarto: ");
			int numQuarto = scanner.nextInt();
			
			quartos[numQuarto] = new Aluguel(nome, email);
		} 
		
		System.out.println("--------");
		System.out.println("Quartos alugados:");
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(i + ": " + quartos[i].toString());
			}
		}
		
		scanner.close();
	}

}


//// inserir a quantidade de quartos que vão ser alugados
//System.out.print("Quantos quartos vão ser alugados? ");
//int quartos = scanner.nextInt();
//
//// declaração dos arrays
//String[] arrayNomes = new String[quartos];
//String[] arrayEmails = new String[quartos];
//int[] arrayQuartos = new int[quartos];
//
//// percorrendo e populando
//for (int i = 0; i < quartos; i++) {
//	scanner.nextLine();
//	System.out.println("Aluguel #" + (i+1));
//	System.out.print("Digite seu nome: ");
//	arrayNomes[i] = scanner.nextLine();			
//	
//	System.out.print("Digite seu email: ");
//	arrayEmails[i] = scanner.nextLine();
//	
//	System.out.print("Digite o número do quarto: ");
//	int numQuarto = scanner.nextInt();
//	
//	
//	System.out.println("--------");
//}
//
//System.out.println("Quartos alugados");
//for (int i = 0; i < quartos; i++) {
//	System.out.print("Número do quarto: ");
//	System.out.println(arrayQuartos[i]);
//	System.out.print("Nome do proprietário: ");
//	System.out.println(arrayNomes[i]);
//	System.out.print("Email do proprietário: ");
//	System.out.println(arrayEmails[i]);
//	System.out.println("--------");
//}