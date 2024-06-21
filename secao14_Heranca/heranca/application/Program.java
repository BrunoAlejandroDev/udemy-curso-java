package application;

import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {
		
		BusinessAccount ba = new BusinessAccount(1234, "Bruno", 10.0, 500.0);
		System.out.println(ba.getBalance()); // usando um metodo da classe account na classe filha;
		
	}

}
