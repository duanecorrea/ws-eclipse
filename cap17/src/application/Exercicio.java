package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import entities.Product;

public class Exercicio {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\arquivo.csv";
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
			
			String str = bf.readLine();
			
			ArrayList<Product> products = new ArrayList<Product>();
			
			while(str != null) {
				String split[] = str.split(",");					
				Product p = new Product(split[0],Double.valueOf(split[1]),Integer.valueOf(split[2]));
				products.add(p);
				str = bf.readLine();
			}
			
			File oldPath = new File(path);			
			boolean result = new File(oldPath.getParent() + "\\out").mkdir();					
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(oldPath.getParent() + "\\out\\summary.csv"))){
				for (Product product : products) {
					bw.write(product.getProduct() + "," + String.format( "%.2f", product.getPrice() * product.getQty()));
					bw.newLine();
				}					
			} catch (IOException e) {
				System.out.println("Erro: " + e.getMessage());				
			}
			
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
