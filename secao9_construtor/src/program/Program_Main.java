package program;

import account.Account;
import java.util.Scanner;
import java.util.Locale;

public class Program_Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account cliente;
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o número da conta (esse valor não poderá ser alterado): ");
		int numConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Deseja depositar um valor inicial para a conta (Digite sim ou nao)? ");
		String saldoInicial = sc.nextLine();
		
		if (saldoInicial.equals("sim")) {
			System.out.print("Digite o valor para o depósito inicial: ");
			double saldoConta = sc.nextDouble();
			cliente = new Account(nome, numConta, saldoConta);
		}
		else {
			cliente = new Account(nome, numConta);
		}
		
		System.out.println(cliente.toString());
		
		sc.close();
	}

}
