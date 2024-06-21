package exercicio1;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.println("Insira o valor da largura do retângulo");
		r.setWidth(sc.nextDouble());
		
		System.out.println("Insira o valor da altura do retângulo");
		r.setHeight(sc.nextDouble());
		
		System.out.println("Área do retângulo: " + r.area());
		System.out.println("Perímetro do retângulo: " + r.perimeter());
		System.out.println("Diagonal do retângulo: " + r.diagonal());
		
		
		sc.close();
	}

}
