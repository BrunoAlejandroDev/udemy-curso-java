package application;

import java.util.Scanner;
import entities.Product;
import java.util.Locale;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Product name: ");
		product.name = sc.nextLine();
		
		System.out.print("Product price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		//product.showDetails();
		System.out.println("Product data: " + product);
		
		
		sc.close();
	}

}
