import java.util.Locale;
import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double hour = scan.nextInt();

		// Basic if else
		if (hour <= 12) {
			System.out.println("Bom Dia!");
		} else if (hour <= 18) {
			System.out.println("Boa Tarde!");
		} else if(hour <= 24){
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Hora Inválida!");
		}

		scan.close();
	}
}