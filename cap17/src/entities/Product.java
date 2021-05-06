package entities;

public class Product {
	
	private String product;
	private Double price;
	private Integer qty;
		
	public Product(String product, Double price, Integer qty) {		
		this.product = product;
		this.price = price;
		this.qty = qty;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

}
