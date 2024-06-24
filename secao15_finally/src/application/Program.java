package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\estudos\\texto.txt");
		Scanner input = null;
		
		try {
			input = new Scanner(arquivo);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
		}
		catch(IOException exception) {
			System.out.println("Erro opening file " + exception.getMessage());
		}
		finally { // executado independente de ter ou não acontecido uma exceção
			if (input != null) {
				input.close();
			}
		}
		System.out.println("Finally executado");
	}

}
