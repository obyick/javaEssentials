package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StoreProduct;

public class Store {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the quantity of products: ");
		int quantity = scan.nextInt();
		
		StoreProduct[] product = new StoreProduct[quantity];
		
		for(int i = 0; i < quantity; i++) {
			System.out.println("Enter the product name: ");
			String name = scan.nextLine();
			System.out.println("Enter the product prices");
			double price = scan.nextDouble();
			System.out.println("Enter how " + quantity + " products names and prices");
			int id = scan.nextInt();
			
			product[i] = new StoreProduct(name, price, id);
			
			scan.nextLine();
		}
		
		
		double sum = 0;
		for(int i = 0; i < quantity; i++) {
			sum += product[i].getPrice();
		}
		
		System.out.println(sum / quantity);
		
		scan.close();
	}

}
