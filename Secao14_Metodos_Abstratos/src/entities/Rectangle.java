package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	// ATRIBUTOS
	private Double width;
	private Double height;
	
	// CONSTRUTORES
	public Rectangle() {
		
	}
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	// GETTERS E SETTERS
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

	// METODOS PUBLICOS
	@Override
	public double area() {
		return width * height;
	}

}
