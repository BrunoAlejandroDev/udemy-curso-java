/*
	Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
	incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
	impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. 
*/

package estruturas_repetitivas_while;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha de 4 dígitos contendo uma combinação dos números 0, 1 e 2");
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha incorreta. Digite novamente");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta.");
		
		sc.close();
	}

}
