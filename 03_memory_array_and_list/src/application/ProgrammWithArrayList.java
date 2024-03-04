package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgrammWithArrayList {

	public static void main(String[] args) {
		// Set default locale to US
		Locale.setDefault(Locale.US);
		// Create a scanner object to read input
		Scanner scan = new Scanner(System.in);

		// Create a list to store strings
		List<String> list = new ArrayList<>();

		// Add elements to the list
		list.add("Flamengo");
		list.add(0, "Fluminense"); // Add at index 0
		list.add("Botafogo");
		list.add("Palmeiras");
		list.add("São Paulo");
		list.add("Corinthians");
		list.add("Vasco da Gama");

		// Print the list after initial addition
		System.out.println("1st: " + list);

		// Duplicate the list
		list.addAll(list);

		// Print the list after duplication
		System.out.println("2nd: " + list);

		// Remove elements from the list
		list.remove(6); // Remove by index
		list.removeIf(x -> x.charAt(0) == 'V'); // Remove elements starting with 'V'
		list.removeIf(x -> x.equals("Botafogo")); // Remove Botafogo

		// Print the list after removals
		System.out.println("3rd: " + list);

		// Remove duplicates from the list
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) { // Changed the loop conditions
				if (list.get(i).equals(list.get(j))) { // Compare using equals() method
					list.remove(j);
					j--; // Decrement j to adjust for removed element
				}
			}
		}

		// Filter the list to include only strings starting with 'F'
		List<String> listWithF = list.stream().filter(x -> x.charAt(0) == 'F').collect(Collectors.toList());

		System.out.println("4th: " + list); // Print the original list
		System.out.println("5th: " + listWithF); // Print the filtered list

		// Find the first string starting with 'C' from the original list
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);

		// Print the found name
		System.out.println("6th: [" + name + "]");

		// Close the scanner
		scan.close();
	}
}