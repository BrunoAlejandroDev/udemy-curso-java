package exercicios_lista;

import java.util.ArrayList;
import java.util.List;

/*
  Exercício 1: Criação e Manipulação de Listas
  Objetivo: Crie uma lista de inteiros, adicione alguns elementos, remova um elemento e imprima a lista.
*/

public class Exercicio1 {

	public static void main(String[] args) {
		// criação da lista
		List<Integer> lista = new ArrayList<>();
		
		// adicionando elementos
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		lista.add(50);
		
		// imprimindo a lista
		for (Integer el : lista) {
			System.out.println(el);
		}
		
		// removendo elementos
		lista.remove(2);
		lista.removeIf(elemento -> elemento.intValue() > 30);
		
		System.out.println("--------");
		for (Integer el : lista) {
			System.out.println(el);
		}
	}

}
