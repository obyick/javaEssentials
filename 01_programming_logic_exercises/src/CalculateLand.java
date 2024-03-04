import java.util.Locale;
import java.util.Scanner;

public class CalculateLand {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double width = scan.nextDouble();
		double length = scan.nextDouble();
		double pricePerMeter = scan.nextDouble();

		double area = width * length;
		double totalPrice = area * pricePerMeter;

		System.out.printf("Área do Terreno: %.2fm²%n", area);
		System.out.printf("Preço do Terreno: R$%.2f", totalPrice);

		scan.close();
	}
}