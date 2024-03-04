package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class GeometryCalculations {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Create two objects to different triangles
		Triangle a = new Triangle();
		Triangle b = new Triangle();

		// X triangle's measure
		a.x = 3;
		a.y = 6;
		a.z = 18;

		// Y triangle's measure
		b.x = 4;
		b.y = 8;
		b.z = 24;
		
		double aArea = a.triangleArea();
		double bArea = b.triangleArea();

		// Output of triangle's areas
		System.out.printf("1th triangle's area: %.2f%n", aArea);
		System.out.printf("2th triangle's area: %.2f%n", bArea);

		// Triangles area comparison
		if (aArea > bArea) {
			System.out.println("Larger triangle's: 1th");
		} else {
			System.out.println("Larger triangle's: 2th");
		}

		scan.close();
	}

}
