import java.util.Locale;
import java.util.Scanner;

public class NumberSign {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		if (number >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		scan.close();
	}

}
