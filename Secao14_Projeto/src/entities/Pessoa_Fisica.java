package entities;

public class Pessoa_Fisica extends Contribuinte{

	// ATRIBUTOS
	private double gastosComSaude;
	
	// CONSTRUTOR
	public Pessoa_Fisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	// GETTERS E SETTERS
	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}
	
	// METODOS PUBLICOS
	@Override
	public double pagarImposto() {
		
		double valorDoImposto;
		
		if (getRendaAnual() < 20000.0) {
			valorDoImposto = getRendaAnual() * 0.15;
		}
		else {
			valorDoImposto = getRendaAnual() * 0.25;
		}
		
		valorDoImposto -= (getGastosComSaude() * 0.5);
		
		if (valorDoImposto < 0.0) {
			valorDoImposto = 0.0;
		}
		
		return valorDoImposto;
	}

	public String mostrarGastoImposto() {
		return "Nome do contribuinte: " + getNome() + "\nValor pago de imposto: $" + pagarImposto();
	}
	
	@Override
	public String toString() {
		return "Pessoa Fisica\n" + 
				"Nome do contribuinte: " + getNome() +
				"\nRenda anual: $" + getRendaAnual() +
				"\nGastos com saúde=" + gastosComSaude +
				"Valor pago de imposto: $" + pagarImposto();
	}
	

}