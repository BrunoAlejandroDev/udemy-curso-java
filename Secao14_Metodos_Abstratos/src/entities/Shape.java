package entities;

import entities.enums.Color;

public abstract class Shape {

	// ATRIBUTOS
	private Color color;
	
	// CONSTRUTOR
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}
	
	// GETTERS E SETTERS
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// METODOS PUBLICOS
	public abstract double area();
	
}
