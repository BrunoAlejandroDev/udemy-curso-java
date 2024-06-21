package exercicio1;

public class Retangulo {
	private double width;
	private double height;
	
	// métodos publicos 
	public double area() {
		return this.getWidth() * this.getHeight();
	}
	
	public double perimeter() {
		return 2*(this.getHeight() + this.getWidth());
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(Math.pow(this.getHeight(), 2) + Math.pow(this.getWidth(), 2)); 
		return diagonal;
	}
	
	// getters e setters
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
