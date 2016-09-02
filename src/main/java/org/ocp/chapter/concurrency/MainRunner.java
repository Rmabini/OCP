package org.ocp.chapter.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Stream;

public class MainRunner {

	public static void main(String[] args) {

		Stream<String> s = Arrays.stream(new String[] { "Apple", "Banana", "Orange" });
		s.forEach(System.out::println);

		Collection<String> c = new ArrayList<>();
		c.add("Apple");
		c.add("Banana");
		c.add("Orange");
		c.parallelStream().forEach(System.out::println);
		;

	}
}

class Runner2 {
	public static void main(String[] args) {
		Executor service = Executors.newSingleThreadScheduledExecutor();
		service.execute(() -> System.out.println("Test"));
		service.execute(() -> System.out.println("Test1"));
		service.execute(() -> System.out.println("Test2"));

	}
}

class MySortingArrays {

	public static void main(String[] args) {

		String[] fruits = { "Pineapple", "Apple", "Orange", "Banana" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		Arrays.sort(fruits);
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}
}

class MySortingCollection {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		for (String fruit : fruits) {
			System.out.println("Fruit " + fruit);
		}

		Collections.sort(fruits);

		for (String fruit : fruits) {
			System.out.println("Fruit " + fruit);
		}
	}
}

class Market {

	public static void main(String[] args) {
		Fruit greenApple = new Fruit("Apple", "green", true, 30, SEASONE.SPRING);
		Fruit redApple = new Fruit("Apple", "red", true, 30, SEASONE.FALL);
		List<Fruit> basket = new ArrayList<>();
		basket.add(redApple);
		basket.add(greenApple);
		Collections.sort(basket);
		for (Fruit fruit : basket) {
			System.out.println(fruit.toString());
		}

	}
}

enum SEASONE {
	WINTER("Winter"), SUMMER("Summer"), SPRING("Spring"), FALL("Fall");

	private String name;

	private SEASONE(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}

class Fruit implements Comparable<Fruit> {
	private String name;
	private String color;
	private boolean seed;
	private int size;
	private SEASONE seasone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isSeed() {
		return seed;
	}

	public void setSeed(boolean seed) {
		this.seed = seed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public SEASONE getSeasone() {
		return seasone;
	}

	public void setSeasone(SEASONE seasone) {
		this.seasone = seasone;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", seed=" + seed + ", size=" + size + ", seasone=" + seasone
				+ "]";
	}

	public Fruit(String name, String color, boolean seed, int size, SEASONE seasone) {
		super();
		this.name = name;
		this.color = color;
		this.seed = seed;
		this.size = size;
		this.seasone = seasone;
	}

	@Override
	public int compareTo(Fruit o) {

		return this.getColor().compareTo(o.getColor());
	}

}

class Person {

	private String name;
	private String lastName;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
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

	public static void main(String[] args) {

		Person p = new Person();
		Comparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
		Comparator<Person> cmpFirstName = (p1, p2) -> p1.getName().compareTo(p2.getName());
		Comparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		

	}

}