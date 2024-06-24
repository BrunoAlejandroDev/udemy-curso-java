package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		metodo1();
	}
	
	public static void metodo1() {
		
		System.out.println("Método 1 iniciado");
		metodo2();
		System.out.println("Método 1 finalizado");
		
	}
	
	public static void metodo2() {
		
		System.out.println("Método 2 iniciado");
		Scanner input = new Scanner(System.in);
		
		try {
			String[] array = input.nextLine().split(" ");
			int posicao = input.nextInt();
			System.out.println(array[posicao]);			
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
			System.out.println("ERRO: Posição invalida e/ou inexistente.");
		}
		catch (InputMismatchException exception) {
			exception.printStackTrace();
			System.out.println("ERRO: valor inválido. Insira apenas números.");
		}
		
		input.close();
		System.out.println("Método 2 finalizado");
		
	}
}
