package application;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Programm {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		// Set the format
		SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		// First get the format, and after get the date using system
		System.out.println(SDF.format(new Date(System.currentTimeMillis())));
		
		// Now with Instant way
		System.out.println(SDF.format(Date.from(Instant.now())));
		
		// Calculate date with Calendar class
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(Date.from(Instant.now()));
		calendar.add(Calendar.DATE, 1);
		System.out.println(calendar.getTime());
		
		// Choose specific time type
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		
		// How change to UTC
		SDF.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(SDF.format(Date.from(Instant.now())));
		
		scan.close();
	}
	
}