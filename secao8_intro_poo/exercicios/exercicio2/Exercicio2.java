package exercicio2;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();

		System.out.print("Digite o nome do funcionário: ");
		employee.setName(sc.nextLine());
		
		System.out.print("Digite o salário bruto do funcionário: ");
		employee.setGrossSalary(sc.nextDouble());
		
		System.out.print("Digite o imposto sobre o salário bruto: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println(employee.toString());
		
		System.out.print("Insira o percentual de aumento de salario: ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Update data: " + employee.toString());
		
		sc.close();
	}

}
