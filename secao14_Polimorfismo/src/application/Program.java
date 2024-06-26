package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		// INICIALIZAÇÃO
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List <Employee> listEmployees = new ArrayList <>(); // arrayList para armazenar os funcionários

		System.out.print("Enter the number of employees: ");
		int n = input.nextInt();
		
		// estrutura para adicionar funcionarios no array
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data");
			
			System.out.print("Outsourced (y/n)? ");
			char typeOfEmployee = input.next().charAt(0);
			
			System.out.print("Name: ");
			input.nextLine(); // consumir quebra de linha
			String name = input.nextLine();
			
			System.out.print("Hours: ");
			int hours = input.nextInt();
			
			System.out.print("Value per hours: ");
			double valuePerHours = input.nextDouble();
			
			// verificação de tipo do trabalhador
			if (typeOfEmployee == 'y') {
				System.out.print("Additional charge: ");
				double additional = input.nextDouble();
				
				OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHours, additional);
				listEmployees.add(outsourcedEmployee);	
			} else {
				Employee employee = new Employee(name, hours, valuePerHours);
				listEmployees.add(employee);				
			}
			
			System.out.println();
		}
		
		// percorrer a lista para mostrar nome e salário
		System.out.println("======== Payments =======");
		
		for (Employee emp : listEmployees) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}
		
		input.close();
		
	}
	
}