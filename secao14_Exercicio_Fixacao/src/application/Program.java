package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Products;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Program {

	public static void main(String[] args) {
		
		// INICIO INICIALIZAÇÃO
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List <Products> listProducts = new ArrayList<>();
		// FIM INICIALIZAÇÃO
		
		System.out.print("Digite o número de produtos: ");
		int numberP = input.nextInt();
		
		// inserir os produtos na lista 
		for (int i = 1; i <= numberP; i++) {
			System.out.println("Dados do produto #" + i);
			
			System.out.println("Produto comum, usado ou importado (c/u/i)? ");
			char typeOfProduct = input.next().charAt(0);
			
			input.nextLine(); // consumir quebra de linha
			System.out.print("Nome: ");
			String name = input.nextLine();
			
			System.out.print("Preço: ");
			double price = input.nextDouble();
			
			if (typeOfProduct == 'c') {
				Products product = new Products(name, price);
				listProducts.add(product);
			} 
			else if (typeOfProduct == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(input.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				
				UsedProduct usedProduct = new UsedProduct(name, price, date);
				listProducts.add(usedProduct);
			}
			else {
				System.out.print("Taxa de importacao: ");
				double taxa = input.nextDouble();
				
				ImportedProduct importedProduct = new ImportedProduct(name, price, taxa);
				listProducts.add(importedProduct);
			}
			System.out.println();
		}
		
		// percorrer o loop 
		for (Products produto : listProducts) {
			System.out.println("====== Etiqueta do produto ======");
			System.out.println(produto.priceTag());
			System.out.println();
		}
		
		input.close();
		
	}

}