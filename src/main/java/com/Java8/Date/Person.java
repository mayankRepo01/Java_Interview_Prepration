package com.Java8.Date;

import java.time.LocalDate;

public class Person {
	
	String name;
	LocalDate dob;
	
	public Person(String name, LocalDate dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	}

	

}
