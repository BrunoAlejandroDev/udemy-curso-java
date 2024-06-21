package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account acc1 = bacc; // associa um objeto BusinessAccount a um objeto Account, já que uma BusinesseAccount é uma Account
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0); // cria um objeto BusinessAccount e faz a conversão desse objeto para o tipo Account
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01); // cria um objeto SavingsAccount e faz a conversão desse objeto para o tipo Account
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(0);
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
	}

}
