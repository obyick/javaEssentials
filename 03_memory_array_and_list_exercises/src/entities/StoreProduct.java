package entities;

public class StoreProduct {
	private String name;
	private Double price;
	private Integer id;
	
	public StoreProduct(String name, double price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public String toString() {
		return "Product: " + name + "\nPrice: " + price + "\nID: " + id;
	}
}
