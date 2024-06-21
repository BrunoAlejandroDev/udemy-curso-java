package exercicios_lista;

import java.util.ArrayList;
import java.util.List;

/*
 	Exercício 2: Soma dos Elementos da Lista
	Objetivo: Crie uma lista de inteiros e calcule a soma de seus elementos.
*/

public class Exercicio2 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		int soma = 0;
		
		for(Integer el : lista) {
			soma += el;
		}
		
		System.out.println("Soma dos elementos da lista: " + soma);
	}

}
