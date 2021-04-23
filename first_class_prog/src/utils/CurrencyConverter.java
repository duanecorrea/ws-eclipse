package utils;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double convert(double price, double quantity) {
		double total = quantity * price;
		return total + total * IOF;
	}

}
