package org.ocp.datetime.exercise;

import java.time.LocalDateTime;

public class RunnerMainLocalDateTime {
	
	public static void main(String[] args) {
		example();
		LocalDateTime christmas = LocalDateTime.of(2015, 12, 25, 0, 0);
		LocalDateTime newYear = LocalDateTime.of(2016, 1, 1, 0, 0);
		System.out.println("New  Year "+ newYear.isAfter(christmas));
	}

	private static void example() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Today's date and time "+now);
	}

}
