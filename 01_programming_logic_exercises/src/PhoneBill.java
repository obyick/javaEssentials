import java.util.Locale;
import java.util.Scanner;

public class PhoneBill {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int minutes = scan.nextInt();
		double price = 50.0;
		
		if (minutes > 100) {
			price += (minutes - 100) * 2;
		}
		
		System.out.println("Valor a pagar: R$" + price);
		
		scan.close();
	}

}
