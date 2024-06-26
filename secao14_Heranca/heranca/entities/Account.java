package entities;

public class Account {

	// ATRIBUTOS
	private Integer numberAccount;
	private String holder;
	protected double balance;
	
	// CONSTRUTOR
	public Account() {
		
	}

	public Account(Integer numberAccount, String holder, double balance) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		this.balance = balance;
	}

	// GETTERS E SETTERS
	public Integer getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(Integer numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	// METODOS PUBLICOS 
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
}
