package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class OrderProcessing {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Order order = new Order(2103, new Date(), OrderStatus.PENDING_PAYMENTS);

		OrderStatus orderStatus = OrderStatus.DELIVERED;
		OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(".DELIVERED = " + orderStatus + "\n.valueOf(\"DELIVERED\") = " + orderStatus2);

		System.out.println(order);

		scan.close();
	}
}
