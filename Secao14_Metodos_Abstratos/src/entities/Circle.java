package entities;

import entities.enums.Color;

public class Circle extends Shape {

	// ATRIBUTOS
	private Double radius;
	
	// CONSTRUTORES
	public Circle() {
		
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	// GETTERS E SETTERS
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// METODOS PUBLICOS
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
}
