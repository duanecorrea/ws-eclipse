package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdfD = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdfH = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);		
	}
	
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}		
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double total() {
		
		double sum = 0;
		for(OrderItem obj : orderItem) {
			sum += obj.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Order moment: " + sdfH.format(this.moment));
		sb.append("\nOrder  status: " + this.status);
		sb.append("\nClient: " + this.client.getName() + "(" + sdfD.format(client.getBirthDate()) + ") - " + this.client.getEmail());		
		sb.append("\nOrder Items:");
		for(OrderItem obj : orderItem) {
			sb.append("\n" + obj);			
		}
		sb.append("\nTotal Price: $" + String.format("%.2f", this.total()));		
		
		return sb.toString();
	}
	
	
	
	
	
	
	

}
