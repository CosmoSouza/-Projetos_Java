package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();

	
	@Override
	public String toString() {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    StringBuilder sb = new StringBuilder();
	    sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
	    sb.append("Order status: ").append(orderStatus).append("\n");
	    sb.append("Client: ").append(client).append("\n");
	    sb.append("Order items:\n");
	    for (OrderItem item : items) {
	        sb.append(item).append("\n");
	    }
	    sb.append("Total price: $").append(String.format("%.2f", total()));
	    return sb.toString();
	}

	
	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}
	public void addItem(OrderItem item) {
	    items.add(item);
	}

	public void removeItem(OrderItem item) {
	    items.remove(item);
	}

	public double total() {
	    double sum = 0.0;
	    for (OrderItem item : items) {
	        sum += item.subTotal();
	    }
	    return sum;
	}
	

}
