package entities;

public class StoreProduct {
	private String name;
	private double price;
	public int quantity;
	
	public StoreProduct() {
	}
	
	public StoreProduct(String name, double price) {
		this.name = name;
		this.price = price;
	} 

	public StoreProduct(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}

	public double inventoryValue() {
		return price * quantity;
	}

	public void addItem(int quantity) {
		this.quantity += quantity;
	}

	public void removeItem(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Product\n" + "Name: " + name + "\nPrice: " + String.format("%.2f", price) + "\nQuantity: " + quantity
				+ "\nStock value: " + String.format("%.2f", inventoryValue()) + "\n";
	}
}
