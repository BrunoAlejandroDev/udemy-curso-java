package exercicio3;

import java.util.Scanner;

public class Student {
	private String name;
	private double n1;
	private double n2;
	private double n3;
	
	// metodos publicos
	public void showFinalGrade() {
		System.out.println();
		System.out.println("---- FINAL GRADE ----");
		System.out.println(this.getName());
		
		double finalScore = this.getN1() + this.getN2() + this.getN3();
		if (finalScore < 60) {
			System.out.println("Final score: " + finalScore);
			System.out.println("FAILED.");
			System.out.println("Missing " + (60 - finalScore) + " points");
		}
		else {
			System.out.println("Final score: " + finalScore);
			System.out.println("PASS.");
		}
	}

	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getN1() {
		return n1;
	}
	public void setN1(Scanner sc, double n1) {
		while (n1 > 30) {
			System.out.println("ERRO: a nota limite para o primeiro trimestre é 30.");
			System.out.print("Digite a nota do primeiro trimestre: ");
			n1 = sc.nextDouble();
		}
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}
	public void setN2(Scanner sc, double n2) {
		while (n2 > 35) {
			System.out.println("ERRO: a nota limite para o segundo trimestre é 35.");
			System.out.print("Digite a nota do segundo trimestre: ");
			n2 = sc.nextDouble();
		}
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}
	public void setN3(Scanner sc, double n3) {
		while (n3 > 35) {
			System.out.println("ERRO: a nota limite para o terceiro trimestre é 35.");
			System.out.print("Digite a nota do terceiro trimestre: ");
			n3 = sc.nextDouble();
		}
		this.n3 = n3;
	}
	
}
