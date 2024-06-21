package estruturas_repetitivas_while;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = sc.nextInt();
		int soma = 0;
		
		while(num != 0) {
			soma += num;
			System.out.println("Digite um número inteiro: ");
			num = sc.nextInt();
		}
		System.out.println("Valor da soma: " + soma);
		sc.close();
	}

}