import java.util.Locale;
import java.util.Scanner;

public class BitwiseOperations {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// 0b binary type identify
		int mask = 0b100000;
		
		int number = scan.nextInt();
		
		if((mask & number) != 0) {
			System.out.println("6th bit is true");
		}
		
		// OR
		System.out.println(mask | number);
		
		// XOR
		System.out.println(mask ^ number);
		
		scan.close();
	}

}
