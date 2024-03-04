import java.util.Locale;
import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("MÚLTIPLOS");
		} else {
			System.out.println("NÃO MÚLTIPLOS");
		}

		scan.close();
	}

}
