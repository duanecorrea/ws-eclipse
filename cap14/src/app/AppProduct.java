package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class AppProduct {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of products: ");
		int num = sc.nextInt();
		
		ArrayList<Product> aProducts = new ArrayList<Product>();
		
		for(int i=1;i<=num;i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)?");
			char opt = sc.next().charAt(0);
			
			System.out.println("Name: ");
			String name = sc.next();
			
			System.out.println("Price: ");
			double price = sc.nextDouble();		
			
			switch (opt) {
				case 'c': {
					aProducts.add(new Product(name,price));
					break;
				}
				case 'u':{
					System.out.println("Manufacture date (DD/MM/YYYY)");
					Date date = sdf.parse(sc.next());
					aProducts.add(new UsedProduct(name,price,date));
					break;					
				}
				case 'i':{
					System.out.println("Customs fee: ");
					double fee = sc.nextDouble();
					aProducts.add(new ImportedProduct(name,price,fee));
					break;					
				}				
			}						
		}
		
		System.out.println("PRICE TAGS:");
		for(Product product : aProducts) {
			System.out.println(product.priceTag());			
		}
		
		
		sc.close();
	}

}
