package entities;

public class Product {
	
	private int name;
	private double price;
	
	public Product() {
		
	}

	public Product(int name, double price) {		
		this.name = name;
		this.price = price;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
