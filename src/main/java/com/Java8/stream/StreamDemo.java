package com.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author mayank.g.mishra
 *
 */
public class StreamDemo {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Ram", 21), new Person("Raju", 12), new Person("a", 25));
		persons.stream().forEach(p->System.out.println(p));
		// Or Method reference way
		persons.stream().forEach(System.out::println);

		Predicate<Person> p = s -> s.getAge() > 20;

		persons.stream().filter(s->s.getAge()>20).forEach(System.out::println);
		// or
		persons.stream().filter(p).forEach(System.out::println);
		persons.stream().skip(2).forEach(System.out::println); //skip first 2 elements and print remaining
		
		
		Stream k=Stream.of("abcd", "adgh", "alcd","kjhv").filter(s->s.startsWith("a"));
		k.forEach(System.out::println);

		List<String> list = Arrays.asList("abc1", "abc2", "abc3"); 
		Long m=list.stream()
		.skip(1)
		.map(element -> element.substring(2,4))
		.sorted()
		.count();
		//m.forEach(System.out::println);
		System.out.println(m);
		
		
	}

}

class Person {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}