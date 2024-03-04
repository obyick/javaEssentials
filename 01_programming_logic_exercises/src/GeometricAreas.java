import java.util.Locale;
import java.util.Scanner;

public class GeometricAreas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		
		double phi = 3.14159;
		
		double triangleArea = A * C / 2;
		double circleArea = phi * Math.pow(C, 2);
		double trapezoidArea = (A+B) * C / 2;
		double squareArea = B*B;
		double rectangleArea = A*B;
		
		System.out.printf("Triângulo: %.3fm²%n", triangleArea);
		System.out.printf("Círculo: %.3fm²%n", circleArea);
		System.out.printf("Trapézio: %.3fm²%n", trapezoidArea);
		System.out.printf("Quadrado: %.3fm²%n", squareArea);
		System.out.printf("Retângulo: %.3fm²%n", rectangleArea);
		
		scan.close();
	}

}
