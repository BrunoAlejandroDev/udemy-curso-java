package estrutura_sequencial;
import java.util.Locale;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "office desk";
		
		int age = 30;
		int code = 5920;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double meausure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which prie is $ %.2f%n", product2, price2);
		System.out.println("");
		
		System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.println("");
		
		System.out.printf("Measue with eight decimal places: %f\n", meausure);
		System.out.printf("Rouded (three decimal places: %.3f\n", meausure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", meausure);
	}

}
