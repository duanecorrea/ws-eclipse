package entities;

public class BankAccount {
	
	private static final double TAX = 5.00;
	
	private int numAcc;
	private String name;
	private double balance;	
	
	public BankAccount() {
		
	}
	
	public BankAccount(int numAcc, String name) {	
		this.numAcc = numAcc;
		this.name = name;
	}

	public BankAccount(int numAcc, String name, double balance) {	
		this.numAcc = numAcc;
		this.name = name;
		deposit(balance);
	}

	public int getNumAcc() {
		return numAcc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance = this.balance - balance - TAX;
	}
	
	public String toString() {
		return "Account " + this.numAcc + ", Holder: " + this.name + ", Balance: $" + String.format("%.2f", this.balance) + "\n";
	}
	
	
	

}
