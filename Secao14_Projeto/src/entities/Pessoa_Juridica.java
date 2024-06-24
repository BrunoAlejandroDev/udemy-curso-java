package entities;

public class Pessoa_Juridica extends Contribuinte {

	// ATRIBUTOS
	private Integer numeroDeFuncionarios;

	// CONSTRUTOR
	public Pessoa_Juridica(String nome, double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	// GETTERS E SETTERS
	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	// METODO PUBLICO
	@Override
	public double pagarImposto() {
		
		if (numeroDeFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
		
	}
	
	public void mostrarGastoImposto() {
		System.out.println("Nome do contribuinte: " + getNome() + "\nValor pago de imposto: $" + pagarImposto());
	}
	
	@Override
	public String toString() {
		return "Pessoa Fisica\n" + 
				"Nome do contribuinte: " + getNome() +
				"\nRenda anual: $" + getRendaAnual() +
				"\nNúmero de funcionários: " + getNumeroDeFuncionarios() +
				"Valor pago de imposto: $" + pagarImposto();
	}
	
}