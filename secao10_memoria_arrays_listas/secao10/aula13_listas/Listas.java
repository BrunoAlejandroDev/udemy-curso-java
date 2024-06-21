package aula13_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		// criando uma lista
		List<String> list = new ArrayList<>();
		
		// adicionando elementos a lista
		list.add("Bruno");
		list.add("Maria");
		list.add("Anna");
		list.add("Geralt");
		list.add("Ciri");
		list.add("Marcos");
		list.add("Bruna");
		
		// imprimindo o tamanho da lista
		System.out.println("Número de elementos da lista:");
		System.out.println(list.size());
		
		// percorrendo a lista com for each
		System.out.println("--------");
		for (String el : list) {
			System.out.println(el);
		}
		
		// remover elementos da lista
		list.remove("Bruna"); // removendo via comparação
		list.remove(5); // removendo via index
		
		list.removeIf(elemento -> elemento.charAt(0) == 'A'); // removendo usando predicado
		
		System.out.println("---------");
		for (String el : list) {
			System.out.println(el);
		}
		
		// imprimindo valores específicos da lista usando predicados
		System.out.println("---------");
		List<String> listaNova = list.stream().filter(elemento -> elemento.charAt(0) == 'C').collect(Collectors.toList()); // imprimir apenas nomes começados com C
		
		for (String el : listaNova) {
			System.out.println(el);
		}
		
		// imprimindo o primeiro nome que começa com uma letra específica
		System.out.println("---------");
		String firstNameG = list.stream().filter(elemento -> elemento.charAt(0) == 'G').findFirst().orElse(null);
		
		System.out.println(firstNameG);
	}

}
