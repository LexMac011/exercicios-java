package model.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		// DATA HORA
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.now();
		
		LocalDate d4 = LocalDate.parse("2001-03-08");
		LocalDateTime d5 = LocalDateTime.parse("2001-03-08T18:51:20");
		Instant d6 = Instant.parse("2001-03-08T18:51:20Z");
		Instant d7 = Instant.parse("2001-03-08T18:51:20-03:00");
		
		LocalDate d8 = LocalDate.parse("02/11/2023", fmt);
		
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		System.out.println(d8);
	}

}
