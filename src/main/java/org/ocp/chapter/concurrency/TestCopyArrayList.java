package org.ocp.chapter.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyArrayList {

	public static void main(String[] args) {
		List<String> movies = new ArrayList<>();

		movies.add("TED");
		movies.add("TED2");
		movies.add("Star Wars");

		Iterator<String> imovies = movies.iterator();

		while (imovies.hasNext()) {
			System.out.println(" ");
			System.out.printf("Movie list %s", imovies.next());
			System.out.println(" ");
			movies.add("Star Wars2");

		}
		
		System.out.println("Size " + movies.size());

		movies.add("Star Wars2");

		imovies = movies.iterator();
		while (imovies.hasNext()) {
			System.out.println(" ");
			System.out.printf("Movie list %s", imovies.next());
			System.out.println(" ");

		}

		System.out.println("Size " + movies.size());

	}

}
