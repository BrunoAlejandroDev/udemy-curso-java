package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Products {
	
	// ATRIBUTOS
	private LocalDate manufacturedDate;

	// CONSTRUTOR
	public UsedProduct(String name, Double price, LocalDate manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	// GETTERS E SETTERS
	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	// METODOS PUBLICOS
	@Override
	public String priceTag() {
		return "Nome: " + this.getName() 
				+ " (Produto usado)"
				+ "\nPreço: $" +String.format("%.2f", this.getPrice()) 
				+ "\nData de fabricação: " 
				+ manufacturedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
	}
}
