package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StoreProduct;

public class Store {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		StoreProduct product = new StoreProduct();
		
		product.setName("Samsung Galaxy S21");
		product.setPrice(2399.32);
		product.quantity = 4;
		
		System.out.println(product);
		
		product.addItem(4);
		System.out.println(product);
		
		product.removeItem(6);
		System.out.println(product);

		scan.close();
	}

}