package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		
		System.out.print("Digite seu nome: ");
		student1.setName(sc.nextLine());
		
		System.out.print("Digite a nota do primeiro trimestre: ");
		student1.setN1(sc, sc.nextDouble());
		
		System.out.print("Digite a nota do segundo trimestre: ");
		student1.setN2(sc, sc.nextDouble());
		
		System.out.print("Digite a nota do terceiro trimestre: ");
		student1.setN3(sc, sc.nextDouble());
		
		student1.showFinalGrade();
		
		sc.close();
	}

}
