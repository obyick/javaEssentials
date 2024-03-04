import java.util.Locale;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double capital = scan.nextDouble();
		double price = scan.nextDouble();
		
		String buy = (price < capital) ? "Yes" : "No";
		
		System.out.println(buy);
		
		scan.close();
	}

}
