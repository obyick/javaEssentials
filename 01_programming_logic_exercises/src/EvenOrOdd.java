import java.util.Locale;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		scan.close();
	}

}
