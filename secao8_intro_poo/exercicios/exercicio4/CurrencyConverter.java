package exercicio4;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double cotacao, double amount) {
		return cotacao * amount * (1.0 + IOF);
	}
}
