package application;

import java.util.Locale;
import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String[] vect = new String[] {"Matheus Erick", "Bruna de Oliveira", "Maria Margarida", "Gilberto Medeiros"};
		
		
		for(String i : vect) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
