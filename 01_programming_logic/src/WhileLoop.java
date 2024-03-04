import java.util.Locale;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double number = scan.nextDouble();
		double result = number;

		while (number != 0) {
			number = scan.nextDouble();
			result += number;
		}
		
		System.out.println(result);

		scan.close();
	}

}
