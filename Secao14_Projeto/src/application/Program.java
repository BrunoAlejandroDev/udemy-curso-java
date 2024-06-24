package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Pessoa_Fisica;
import entities.Pessoa_Juridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Contribuinte> listaContribuintes = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int numero = input.nextInt();
		
		// laço for para inserir instancias na lista de contribuintes
		for (int i = 1; i <= numero; i++) {
			
			System.out.println("Contribuinte #" + i);
			
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char tipoContribuinte = input.next().charAt(0);
			
			System.out.print("Nome do contribuinte ou da empresa: ");
			input.nextLine();
			String nome = input.nextLine();
			
			System.out.print("Insira a renda anual: ");
			Double rendaAnual = input.nextDouble();
			
			// verificação do tipo do contribuinte
			if (tipoContribuinte == 'f') {
				System.out.print("Insira os gastos com saúde: ");
				Double gastosSaude = input.nextDouble();
				
				// instanciar pessoa fisica
				Pessoa_Fisica pf = new Pessoa_Fisica(nome, rendaAnual, gastosSaude);
				listaContribuintes.add(pf);
			}
			else {
				System.out.print("Insira o número de funcionários: ");
				Integer numeroFuncionarios = input.nextInt();
				
				// instanciar pessoa juridica
				Pessoa_Juridica pj = new Pessoa_Juridica(nome, rendaAnual, numeroFuncionarios);
				listaContribuintes.add(pj);
			}
			
			System.out.println();
		}
		
		// percorrer a lista e mostrar o valor pago de imposto
		for (Contribuinte contribuinte : listaContribuintes) {
			System.out.println("Nome do contribuinte: " + contribuinte.getNome() + 
					"\nValor pago de imposto: $" + String.format("%.2f", contribuinte.pagarImposto()));
			System.out.println();
		}
		
		// percorrer a lista e mostrar detalhes do contribuinte 
		
		
		// percorrer a lista e mostrar o valor total de impostos pagos
		System.out.println();
		double soma = 0;
		for (Contribuinte contribuinte : listaContribuintes) {
			soma += contribuinte.pagarImposto();
		}
		System.out.println("Valor total de impostos pago: $" + String.format("%.2f", soma));
		

		input.close();
	}

}
