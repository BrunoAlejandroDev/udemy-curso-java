package entities;

public class BusinessAccount extends Account {

	// ATRIBUTOS
	private double loanLimit;
	
	// CONSTRUTORES
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer numberAccount, String holder, double balance, double loanLimit) {
		super(numberAccount, holder, balance); // atributos do construtor da classe conta
		this.loanLimit = loanLimit;
	}

	// GETTERS E SETTERS
	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// METODOS PUBLICOS
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
}
