package Application;

public class Program_java {
	private String name;
	private double price;
	private int quantity;

	public Program_java() {
	 }

	public Program_java(String name, double price, int quantity) {
	 this.name = name;
	 this.price = price;
	 this.quantity = quantity;
	 }

	public Program_java(String name, double price) {
	 this.name = name;
	 this.price = price; 
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
	 return quantity;
	 } 
   }
