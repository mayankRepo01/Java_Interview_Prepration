package com.Java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_Demo {

	public static void main(String[] args) {
		
		// Consumer to display a number
		Consumer<Integer> c=s->System.out.println(s);
		//or
		
		//This is the method reference way and we don't need variable in this case
		//Consumer<Integer> c1=System.out::println;
		
		//Using this
		c.accept(46);
		
		// Consumer to multipply a number to each element in list
		Consumer<List<Integer>> Muliplyby2=(list)->{
			for(int i=0;i<list.size();i++)
				list.set(i,2*list.get(i));
		};
		
		// Consumer to multipply a user provided number to each element in list
		BiConsumer<List<Integer>,Integer> Muliplybyx=(list,x)->{
			for(int i=0;i<list.size();i++)
				list.set(i,x*list.get(i));
		};
		
		
		//List to test
		List<Integer> nums=Arrays.asList(2,4,6,8,10);
		
		//Muliplyby2.accept(nums);
		Muliplybyx.accept(nums, 10);
		
	
		//Using Stream to print the list
		
		//Here "c" represent the consumer we created for print we can use that 
		//nums.stream().forEach(c);
		//or we can write our own lambda
		//nums.stream().forEach(a->System.out.println(a+""));
		
		//or we have a direct function list itself that can take a lambda expression or consumer
		nums.forEach(c);
		
		

	}

}
