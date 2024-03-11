package entities;

public class OrderItem {
	private Integer quantity;
	private Double value;

	public Double subTotal() {
		return quantity * value;
	}
}
