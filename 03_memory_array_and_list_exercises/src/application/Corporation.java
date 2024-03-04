package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeCorporation;

public class Corporation {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Employee's register
		System.out.println("How many employees will be registered? ");
		int size = scan.nextInt();

		List<EmployeeCorporation> employee = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the employeer " + (i+1) + "th ID: ");
			int id = scan.nextInt();

			System.out.println("Whats the name of " + id + " employeer? ");
			String name = scan.nextLine().concat(scan.nextLine());

			System.out.println("How much does " + name + " earn as a salary? ");
			double salary = scan.nextDouble();

			employee.add(new EmployeeCorporation(id, name, salary));
		}

		for (int i = 0; i < size; i++) {
			System.out.println((i + 1) + "th " + "employeer\n" + employee.get(i));
		}

		scan.close();
	}

}
