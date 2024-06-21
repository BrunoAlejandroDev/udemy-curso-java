// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o  X, se for o caso.

package estruturas_repetitivas_for;

public class Exercicio1 {

	public static void main(String[] args) {
		int valor = 15;
		
		for(int i = 1; i <= valor; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}