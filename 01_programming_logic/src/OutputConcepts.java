import java.util.Locale;
import java.util.Scanner;

public class OutputConcepts {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = scan.nextInt();
		int code = 5290;

		char gender = 'F';

		double price1 = 2100;
		double price2 = 650.5;
		double measure = 53.234567;

		// Products and prices
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f%n", product1, price1);
		System.out.printf("%s, which price is $%.2f%n", product2, price2);

		// Record and Measure
		System.out.printf("Record: %s years old, code %d and gender %c%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);

		scan.close();
	}

}
