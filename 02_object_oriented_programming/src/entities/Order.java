package entities;

import java.sql.Date;

public class Order {
	private Date date;
	private StoreProduct product;
	
	public Order(Date date, StoreProduct product) {
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public StoreProduct getProduct() {
		return product;
	}

	public void setProduct(StoreProduct product) {
		this.product = product;
	}
	
}
