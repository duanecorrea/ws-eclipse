package app;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f",CurrencyConverter.convert(price, quantity)));		
		
		sc.close();

	}

}
