package entities;

public class Products {

	// ATRIBUTOS
	private String name;
	private Double price;
	
	// CONSTRUTOR
	public Products() {
		
	}

	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	// GETTER E SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	// METODOS PUBLICOS
	public String priceTag() {
		return "Nome: " + this.getName() 
			+ "\nPreço $" 
			+ this.getPrice();
	}
	
}
