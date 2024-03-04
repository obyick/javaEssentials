import java.util.Locale;
import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int higher = max(A, B, C);
		
		System.out.println((higher == A) ? "A is the higher value" : (higher == B) ? "B is the higher value" : "C is the higher value");
		
		scan.close();
	}

	public static int max(int A, int B, int C) {
		if(A > B && A > C) {
			return A;
		} else if (B > C) {
			return B;
		} else {
			return C;
		}
	}
}
