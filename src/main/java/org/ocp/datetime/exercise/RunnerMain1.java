package org.ocp.datetime.exercise;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;

public class RunnerMain1 {
	
	public static void main(String[] args) {
		//example();
		//example1();
		//example2();
		//example3();
		example4();
	}

	/*
	 * Creating LocalDate using Clock
	*/
	private static void example4() {
		LocalDate now = LocalDate.now(Clock.systemDefaultZone());
		System.out.println("Today's date using Clock "+now);
	}
    
	/*
	 * Adding days to current day using 
	 * LocalDate.plusDays
	 * passing long value
	*/
	private static void example3() {
		long visaValidyDays = 180L;
		LocalDate today = LocalDate.now();
		System.out.println("Visa valid from today "+today.plusDays(visaValidyDays));
	}

	/*
	 * Getting date by passing YEAR (MONT class) and DAY
	 * LocalDate.of()
	*/
	private static void example2() {
		LocalDate valentinesDay = LocalDate.of(2016, Month.FEBRUARY, 14);
		System.out.println("Valentines Day is on "+valentinesDay);
	}

	/*
	 * Getting date by passing YEAR MONT and DAY
	 * LocalDate.of()
	*/
	private static void example1() {
		LocalDate myBirthday = LocalDate.of(1983,10, 10);
		System.out.println("My birtday is on "+myBirthday);
	}
      
	/* Getting the date today using Factory
	 * LocalDate.now()
	*/
	private static void example() {
		LocalDate now = LocalDate.now();
		System.out.println("Today's Date "+now);
	}

}
