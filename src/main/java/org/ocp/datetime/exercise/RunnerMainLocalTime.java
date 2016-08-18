package org.ocp.datetime.exercise;

import java.time.LocalTime;
import java.time.ZoneId;

public class RunnerMainLocalTime {

	public static void main(String[] args) {
		example();
		example1();
		example2();
		example3();
	}

	private static void example3() {
		LocalTime tokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo time is "+ tokyo);
	}

	private static void example2() {
		long hours = 6;
		long minutes = 30;
		LocalTime now = LocalTime.now();
		System.out.println("Now is "+now);
		System.out.println("After is "+now.plusHours(hours).plusMinutes(minutes));
	}

	private static void example1() {
		LocalTime now = LocalTime.of(18, 20);
		System.out.println("Time of " + now);
	}

	/*
	 * Creating a time using LocalTime.now()
	 */
	private static void example() {
		LocalTime now = LocalTime.now();
		System.out.println("The time is " + now);
	}

}
