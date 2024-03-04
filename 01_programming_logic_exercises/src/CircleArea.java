import java.util.Locale;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double circleRadius = scan.nextDouble();
		double phi = 3.14159;

		double area = phi * Math.pow(circleRadius, 2);

		System.out.printf("Área do Círculo: %.4fm²", area);

		scan.close();
	}
}