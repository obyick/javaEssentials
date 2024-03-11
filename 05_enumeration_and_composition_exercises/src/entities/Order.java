package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus orderStatus;

	public void addItem(OrderItem orderItem) {

	}

	public void removeItem(OrderItem orderItem) {

	}

	public Double total() {
		return 1D;
	}
}
