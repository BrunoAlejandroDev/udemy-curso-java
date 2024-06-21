package exercicios_lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 	Exercício 3: Busca em Lista
	Objetivo: Crie uma lista de strings e verifique se uma determinada string está presente na lista.
*/

public class Exercicio3 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Ciri");
		lista.add("Geralt");
		lista.add("Triss");
		lista.add("Yeneffer");
		
		String nomeProcurado = "Carlos";
		
		// criando nova lista para guardar o nome
		List<String> novaLista = lista.stream().filter(elemento -> elemento.contains(nomeProcurado)).collect(Collectors.toList());
		
		if (novaLista.isEmpty()) {
			System.out.println("O nome " + nomeProcurado + " não foi encontrado na lista.");
		} else {
			for(String el : novaLista) {
				System.out.println(el);
			}						
		}
	}
}