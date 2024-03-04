package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Account number
		System.out.println("Enter account number: ");
		int id = scan.nextInt();

		// Optional cash question
		double initial = 0.0;

		System.out.println("Is there a initial cash: true/false?");
		boolean optionalQuestion = scan.nextBoolean();

		// Optional cash answer
		if (optionalQuestion) {
			System.out.println("Enter your initial deposit: ");
			initial = scan.nextDouble();
		} else {
			System.out.println("Your initial deposit is: " + initial);
		}

		// Account holder
		System.out.println("Enter the account holder: ");
		String name = scan.next();

		// Initialing Class
		BankAccount bankAccount = new BankAccount(id, initial, name);

		// Add cash question
		System.out.println("Choose your operation" + "\nA: Add cash to account" + "\nB: Withdraw money" + "C: Exit");
		String cashQuestion = scan.next();

		if (cashQuestion.equals("A")) {
			System.out.println("Enter the amount you want add: ");
			bankAccount.deposit(scan.nextDouble());
		} else if (cashQuestion.equals("B")) {
			System.out.println("Enter the amount you want to withdraw: ");
			bankAccount.withdraw(scan.nextDouble());
		} else if (cashQuestion.equals("C")) {
			System.out.println("Have a nice day");
		} else {
			System.out.println("Invalid choice");
		}

		System.out.println(bankAccount);

		scan.close();
	}

}
