package entities;

public abstract class Contribuinte {

	// ATRIBUTOS
	private String nome;
	private double rendaAnual;
	
	// CONSTRUTORES
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	// GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	// METODOS PUBLICOS
	public abstract double pagarImposto();
}