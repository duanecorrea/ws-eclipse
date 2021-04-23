package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Product x; 		
			
		x = new Product();
		System.out.print("Enter Product data:\n" + "Name: ");
		x.name = sc.next();
		
		System.out.print("Price: ");
		x.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		x.quantity = sc.nextInt();
		System.out.println();
		
		System.out.println("Product data:" + x);
		
		System.out.print("Enter the number of products to be added in stock:");		
		x.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.println("Updated data:" + x);
		
		System.out.print("Enter the number of products to be removed from stock:");		
		x.removeProducts(sc.nextInt());
		System.out.println();		
		
		System.out.println("Updated data:" + x);

		sc.close();
		
	}	
}
