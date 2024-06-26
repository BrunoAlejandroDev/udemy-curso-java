package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Programm {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		SimpleDateFormat dataContract = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println();
		System.out.print("Enter department's name: ");
		String departmentName = input.nextLine();
		
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = input.nextLine();
		
		System.out.print("Level: ");
		String workerLevel = input.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = input.nextDouble();
		
		// instância da classe trabalhador e da classe departamento
		Worker worker1 = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.println();
		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = input.nextInt();
		
		for (int i = 1; i <= numberOfContracts; i++) {
			System.out.println();
			System.out.println("====== CONTRACT ======");
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = dataContract.parse(input.next());
			
			System.out.print("Value per hour: ");
			double valuePerHours = input.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = input.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHours, hours);
			worker1.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = input.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println();
		System.out.println("Name: " + worker1.getName());
		System.out.println("Department: " + worker1.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker1.income(year, month)));
		
		input.close();
	}

}
