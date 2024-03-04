package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Control;

public class Employee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Control employee = new Control();
		
		employee.name = "Bruna de Oliveira Jereissati";
		employee.salary = scan.nextDouble();
		employee.newSalary(62);
		
		System.out.println(employee);
		
		scan.close();

	}

}
