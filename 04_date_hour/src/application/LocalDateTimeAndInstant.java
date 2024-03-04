package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class LocalDateTimeAndInstant {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateAndHour = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dateAndHourWithZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		

		// Local
		System.out.println(LocalDate.now());

		// Local
		System.out.println(LocalDateTime.now());

		// GMT
		System.out.println(Instant.now());
		
		// Convert to ISO086
		System.out.println(Instant.now().toString());

		// New LocalDate object
		System.out.println(LocalDateTime.parse("04/01/2002 02:12", dateAndHour));
		
		// Specific date and hour using of
		System.out.println(LocalDateTime.of(2002, 1, 1, 2, 12));
		
		// Date with specific format
		System.out.println(LocalDate.now().format(date));
		
		// Date and hour with specific format
		System.out.println(LocalDateTime.now().format(dateAndHour));
		
		// Date and hour with specific format for Instant class
		System.out.println(dateAndHourWithZone.format(Instant.now()));
		
		// Convert global date to local date
		System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		
		// Get specific type of date
		System.out.println(LocalDateTime.now().getDayOfYear());
		
		// Date plus anything else (date, hour etc...)
		LocalDateTime date1 = LocalDateTime.now().plusDays(2);
		System.out.println(date1);
		
		// Get the difference between dates
		System.out.println(Duration.between(LocalDate.now().atStartOfDay(), LocalDate.now().atStartOfDay().plusYears(1)).toDays());

		scan.close();
	}

}