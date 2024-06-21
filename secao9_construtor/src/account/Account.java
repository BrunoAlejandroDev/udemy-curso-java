package account;

public class Account {
	// Atributos
	private String nomeTitular;
	private int numConta;
	private double saldoConta;
	
	// Construtores 
	public Account(String nomeTitular, int numConta, double depositoInicial){
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
		realizarDeposito(depositoInicial);
	}
	
	public Account(String nomeTitular, int numConta){
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
	}
	
	// Metodos publicos
	public void realizarDeposito(double valor) {
		this.saldoConta += valor;
	}
	
	public void realizarSaque(double valor) {
		this.saldoConta -= valor + 5;
	}
	
	public String toString() {
		return "-------- \n" +
				"Dados do cliente \n" +
				"Nome do titular: " +
				this.getNomeTitular() +
				" | Número da conta: " +
				this.getNumConta() +
				" | Saldo da conta: " +
				this.getSaldoConta();
	}
	
	// Getters e setters
	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
}