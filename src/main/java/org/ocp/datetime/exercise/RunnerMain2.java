package org.ocp.datetime.exercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class RunnerMain2 {
	public static void main(String[] args) {

	}
}

class DateTimeChecker {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		today = today.minus(2, ChronoUnit.DECADES);
		System.out.println(today);
	}
}