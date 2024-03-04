import java.util.Locale;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner scan = new Scanner(System.in);
			
			String day;
			int dayNumber = scan.nextInt();
			
			switch(dayNumber) {
			case 1:
				day = "Domingo";
				break;
			case 2:
				day = "Segunda";
				break;
			case 3:
				day = "Terça";
				break;
			case 4:
				day = "Quarta";
				break;
			case 5:
				day = "Quinta";
				break;
			case 6:
				day = "Sexta";
				break;
			case 7:
				day = "Sábado";
				break;
			default:
				day = "Não";
				break;
			}
			
			System.out.println(day + " é dia de alegria!");
			
			scan.close();
	}

}
