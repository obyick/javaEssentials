package application;

import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Activ2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Post postOne = new Post(Date.from(Instant.now()), "Traveling to New Zealand",
				"I'm going to visit this wonderful country", 12);

		postOne.addComments(new Comment("Have a nice trip :)"));
		postOne.addComments(new Comment("WOW that's awesome"));

		System.out.println(postOne);

		Post postTwo = new Post(Date.from(Instant.now()), "Good night guys ZZZZzzzzz", "See you tomorrow", 2039);

		postTwo.addComments(new Comment("Good night my love"));
		postTwo.addComments(new Comment("Sleep well rsrs"));

		System.out.println(postTwo);

		scan.close();
	}

}
