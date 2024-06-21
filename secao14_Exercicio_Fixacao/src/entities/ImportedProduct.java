package entities;

public class ImportedProduct extends Products {
	
	// ATRIBUTOS
	private double customFee;

	// CONSTRUTOR
	public ImportedProduct(String name, Double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	// GETTERS E SETTERS
	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	// METODOS PUBLICOS
	@Override
	public String priceTag() {
		return "Nome: " + this.getName() + 
				"\nPreço: $" + 
				String.format("%.2f", this.getPrice()) + 
				"\nTaxa de importação: $" + 
				String.format("%.2f", this.getCustomFee()); 
	}
	
	public double totalPrice() {
		return this.getPrice() + this.getCustomFee();
	}
	
}
