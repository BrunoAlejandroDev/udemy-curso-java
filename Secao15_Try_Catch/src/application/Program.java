package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			String[] array = input.nextLine().split(" ");
			int posicao = input.nextInt();
			System.out.println(array[posicao]);			
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("ERRO: Posição invalida e/ou inexistente.");
		}
		catch (InputMismatchException exception) {
			System.out.println("ERRO: valor inválido. Insira apenas números.");
		}
		
		System.out.println("Programa finalizado");
		
		input.close();
		
	}

}
