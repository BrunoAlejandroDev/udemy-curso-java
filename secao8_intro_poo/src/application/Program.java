package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle triangulo1 = new Triangle();
		Triangle triangulo2 = new Triangle();
		
		System.out.println("Enter the measures of triangle 1: ");
		triangulo1.a = sc.nextDouble();
		triangulo1.b = sc.nextDouble();
		triangulo1.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle 2: ");
		triangulo2.a = sc.nextDouble();
		triangulo2.b = sc.nextDouble();
		triangulo2.c = sc.nextDouble();
		
		double areaTriangulo1 = triangulo1.area();
		double areaTriangulo2 = triangulo2.area();
		
		System.out.printf("Área do triângulo 1: %.2f\n", areaTriangulo1);
		System.out.printf("Área do triângulo 2: %.2f\n", areaTriangulo2);
		
		sc.close();
	}

}
