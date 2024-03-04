import java.util.Locale;
import java.util.Scanner;

public class GameDuration {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int entrancesHour = scan.nextInt();
		int exitsHour = scan.nextInt();

		if (entrancesHour > exitsHour) {
			System.out.println("O jogo durou " + (24 - entrancesHour + exitsHour) + " horas");
		} else {
			System.out.println("O jogo durou " + (exitsHour - entrancesHour) + " horas");
		}

		scan.close();
	}

}