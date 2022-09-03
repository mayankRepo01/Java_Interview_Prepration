package com.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Stream_Map_Filter_Reduce {
	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Ram", 21), new Person("Raju", 12), new Person("a", 25));
		
		double Avg_Age=persons.stream().map(p->p.age).filter(age->age>20).collect(Collectors.averagingInt(p->p));
		System.out.println(Avg_Age);		
		
		
		
		
		String names="Mayank,Naman,Sanket";
		String []strs=names.split(",");
		
		List<User> users=Arrays.stream(strs)
			  .map(User::new).collect(Collectors.toList());
		
		users.stream().forEach(a->a.print());
	}

}
