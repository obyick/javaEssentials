package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrixConcepts {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Row size
		System.out.println("Enter row's size: ");
		int row = scan.nextInt();

		// Column size
		System.out.println("Enter column's size: ");
		int column = scan.nextInt();

		// Declare matrix
		int[][] matrix = new int[row][column];

		// Fill matrix
		System.out.println("Fill your matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}

		// Entire matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Principal diagonal matrix
		System.out.print("Principal diagonal matrix: ");
		for (int i = 0; i < row; i++) {
			System.out.print(i < column ? matrix[i][i] + " ": " ");
		}

		// Shows neighbors to special number
		int specialNumber = 2;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (matrix[i][j] == specialNumber) {
					System.out.println("\nPosition of " + specialNumber + ": (" + i + ", " + j + ")");
					
					if(i > 0) {
						System.out.println("Up to " + specialNumber + ": " + matrix[i - 1][j]);
					}
					
					if(j > 0) {
						System.out.println("Left to " + specialNumber + ": " + matrix[i][j - 1]);
					}
					
					if(j < column - 1) {
						System.out.println("Right to " + specialNumber + ": " + matrix[i][j + 1]);
					}
					
					if(i < row - 1) {
						System.out.println("Down to " + specialNumber + ": " + matrix[i + 1][j]);
					}
				}
			}
			
			System.out.println();
		}

		scan.close();
	}

}
