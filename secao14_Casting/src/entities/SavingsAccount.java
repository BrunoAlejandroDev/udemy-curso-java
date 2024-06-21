package entities;

public class SavingsAccount extends Account {

	// ATRIBUTOS
	private double interestRate;
	
	// CONSTRUTOR
	public SavingsAccount(Integer numberAccount, String holder, double balance, double interestRate) {
		super(numberAccount, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	// METODOS PUBLICOS
	public void updateBalance() {
		balance += balance * interestRate; 
	}
	
}
