package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class DollarQuote {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double wallet = scan.nextDouble();

		CurrencyConverter.converter(wallet);

		System.out.println("Dollar price: " + CurrencyConverter.dollar
				+ "\nWallet value: " + wallet
				+ "\nAmount to be paid in BRL: " + String.format("%.2f", CurrencyConverter.converter(wallet)));

		scan.close();
	}

}
