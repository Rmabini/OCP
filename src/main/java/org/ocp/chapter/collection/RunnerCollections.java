package org.ocp.chapter.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class RunnerCollections {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("noah");
		names.add("eunice");
		names.add("prisca");

		names.replaceAll(String::toUpperCase);
		names.forEach(System.out::println);

	}
}

class RunningMap {

	public static void main(String[] args) {
		Map<String, String> nbaPlayer = new HashMap<>();
		nbaPlayer.getOrDefault("pba", "no-player");
	}

}

class RunningPeople {
	public static void main(String[] args) {
		Person robert = new Person("Robert", "Mabini", 32);
		Person roxanne = new Person("Roxanne", "Mabini", 30);
		Person eunice = new Person("Eunice", "Mabini", 6);
		Person prisca = new Person("Prisca", "Mabini", 4);
		Person noah = new Person("Noah", "Mabini", 2);

		List<Person> people = new ArrayList<Person>(Arrays.asList(robert, roxanne, eunice, prisca, noah));
		Predicate<Person> personAge = person -> person.getAge() > 10;
		people.removeIf(personAge);
		people.replaceAll(person -> new Person(person.getName(), person.getLastName().toUpperCase(), person.getAge()));
		people.sort(Comparator.comparing(Person::getAge));
		people.forEach(System.out::println);

	}
}


class Person {
	private String name;
	private String lastName;
	private int age;

	public Person(String name, String lastName, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
	}

}