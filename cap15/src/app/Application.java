package app;

import java.util.Locale;
import java.util.Scanner;

import model.exceptions.AccExceptions;
import module.entities.Account;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number: ");
		int number = sc.nextInt();
		
		System.out.println("Holder: ");
		String holder = sc.next();
		
		System.out.println("Initial balance: ");
		double iniBalance = sc.nextDouble();
		
		System.out.println("Withdraw limit: ");
		double withLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, iniBalance, withLimit);
		
		System.out.println("\nEnter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		
		try {
			acc.withdraw(withdraw);
			System.out.println("New balance = " + acc.getBalance());
		} catch (AccExceptions e) {			
			System.out.println("Withdraw error: " + e.getMessage());;
		}		
		
		sc.close();

	}

}
