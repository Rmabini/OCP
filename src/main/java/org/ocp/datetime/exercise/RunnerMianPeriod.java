package org.ocp.datetime.exercise;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class RunnerMianPeriod {

	public static void main(String[] args) {
		example();
		example1();
		example3();

	}

	private static void example3() {
		Period annually = Period.ofYears(1); // every 1 year
		Period quarterly = Period.ofMonths(3); // every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

		System.out.println(annually);
		System.out.println(quarterly);
		System.out.println(everyThreeWeeks);
		System.out.println(everyOtherDay);
		System.out.println(everyYearAndAWeek);
	}

	private static void example1() {
		Period year = Period.ofYears(1983);
		System.out.println("Birth Year is " + year);
	}

	private static void example() {
		LocalDate now = LocalDate.now();
		LocalDate dateOfBirth = LocalDate.of(1983, Month.OCTOBER, 10);
		Period period = Period.between(now, dateOfBirth);
		System.out.println("Period between " + period);
	}
}
