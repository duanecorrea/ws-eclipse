package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class app {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter client data: \n");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Email");
		String email = sc.next();
		
		System.out.println("Birth Date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());			
		
		Client client = new Client(name,email,date);
		
		System.out.println("Enter order data:");
		System.out.println("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.println("How many items to this order? ");
		
		int numItems = sc.nextInt();
		
		for(int i = 1; i <= numItems; i++) {
			System.out.println("Enter order data:");
			System.out.println("Product name: ");
			String prod = sc.next();						
			
			System.out.println("Product price: ");
			double price = sc.nextDouble();
			
			Product product = new Product(prod,price);
			
			System.out.println("Quantity: ");
			int qty = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(qty, price, product);
			
			order.addItem(orderItem);		
			
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);	
		
		sc.close();

	}

}
