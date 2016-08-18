package org.ocp.datetime.exercise;

import java.time.Clock;
import java.time.Instant;

public class RunnerMainInstance {
	
	public static void main(String[] args) {
		example();
		Instant instant= Instant.now(Clock.systemDefaultZone());
		System.out.println(instant);
	}

	private static void example() {
		Instant instance = Instant.now();
		System.out.println(instance);
	}

}
