package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BoardingHouseTenant;

public class BoardingHouse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Set default locale for consistent formatting
		Scanner scan = new Scanner(System.in); // Create Scanner object for input

		int houseSize = 8; // Total rooms in the boarding house
		int occupiedRooms = 3; // Number of initially occupied rooms

		BoardingHouseTenant[] rooms = new BoardingHouseTenant[houseSize]; // Array to store BoardingHouse objects

		// Input details for occupied rooms.
		for (int i = 0; i < occupiedRooms; i++) {
			String name = scan.nextLine(); // Read tenant's name
			String email = scan.next(); // Read tenant's email
			double value = scan.nextDouble(); // Read rent value
			int roomNumber = scan.nextInt(); // Read room number

			// Create BoardingHouse object if room number is valid
			if (roomNumber < houseSize && roomNumber >= 0) {
				rooms[roomNumber] = new BoardingHouseTenant(name, email, value, roomNumber);
			}

			scan.nextLine(); // Consume newline character after room number
		}

		// Print details of all rooms
		for (int i = 0; i < houseSize; i++) {
			System.out.println(rooms[i]); // Print details of each room
		}

		scan.close(); // Close Scanner object.
	}

}