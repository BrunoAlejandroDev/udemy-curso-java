package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.enums.Color;
import entities.Circle;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List <Shape> listOfShapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int number = input.nextInt();
		
		for (int i = 1; i <= number; i++) {
			
			System.out.println("Shape #" + i + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char typeShape = input.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(input.next());
			
			// verificação da forma
			if (typeShape == 'r') {
				
				System.out.print("Width: ");
				double width = input.nextDouble();
				
				System.out.print("Height: ");
				double height = input.nextDouble();
				
				// instanciar um objeto rectangle
				listOfShapes.add(new Rectangle(color, width, height));
				
			}
			else {
				System.out.print("Radius: ");
				double radius = input.nextDouble();
				
				listOfShapes.add(new Circle(color, radius));
			}
			
			System.out.println();
			
		}
		
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : listOfShapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		input.close();

	}

}
