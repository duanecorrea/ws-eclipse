package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BankAccount bankAccount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numAcc = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		double balance = 0;				
		
		if(answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}				
		
		if(balance == 0) {
			bankAccount = new BankAccount(numAcc,name);
		}
		else {
			bankAccount = new BankAccount(numAcc,name,balance);
		}
		
		System.out.println("\nAccount data: \n" + bankAccount);
		
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		bankAccount.deposit(balance);
		
		System.out.println("Updated account data: \n" + bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		bankAccount.withdraw(balance);
		
		System.out.println("Updated account data: \n" + bankAccount);
		
		
		
		sc.close();
		

	}

}
