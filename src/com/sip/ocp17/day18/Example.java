package com.sip.ocp17.day18;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.UnsupportedTemporalTypeException;

public class Example {

	public static void main(String[] args) {
		/*System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());*/
		
		/*ZoneId zone = ZoneId.of("US/Eastern");
		System.out.println(zone);
		ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		System.out.println(zoned1);
		System.out.println(ZoneId.systemDefault());*/
		System.out.println(ZoneId.systemDefault());
		/*
		ZoneId zone = ZoneId.of("Africa/Lagos");
		ZonedDateTime zoned2 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
		System.out.println(zoned2);*/
		/*
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		Period period = Period.of(2, 6, 3);
		System.out.println(start.plus(period));
		
		Duration daily = Duration.ofDays(1); // PT24H
		System.out.println(daily);*/
		/*LocalDate date = LocalDate.of(2015, 5, 25);
		Period period = Period.ofDays(1);
		Duration days = Duration.ofDays(1);
		System.out.println(date.plus(period)); // 2015–05–26
		System.out.println(date.plus(days));*/ // Unsupported unit: Seconds 
		//UnsupportedTemporalTypeException ex;
		/*
		Instant now = Instant.now();
		for(int i=0; i<1000000; i++) {
			System.out.println("i="+i);
		}
		Instant later = Instant.now();
		Duration duration = Duration.between(now, later);
		System.out.println(duration.toSeconds()); */
		
		LocalDate date = LocalDate.of(2015, 5, 25);
		LocalTime time = LocalTime.of(11, 55, 00);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(zonedDateTime);
		
		Instant instant = zonedDateTime.toInstant();
		System.out.println(instant);

	}

}
