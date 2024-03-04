import java.util.Locale;
import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String myName = "matheus erick barros costa";
	
		// Format
		System.out.println(myName.toLowerCase());
		System.out.println(myName.toUpperCase());
		System.out.println(myName.trim());
		
		// Cut
		System.out.println(myName.substring(10));
		System.out.println(myName.substring(10, 14));
		
		// Replace
		System.out.println(myName.replace(" ", "-"));
		
		// Search
		System.out.println(myName.indexOf("e"));
		System.out.println(myName.lastIndexOf("e"));
		
		// Divisor
		String[] V = myName.split(" ");
		for(int i = 0; i < V.length; i++) {
			System.out.println(i + "th name: " + V[i]);
		}
		
		scan.close();
	}
}