package com.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap_Demo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> list1=Arrays.asList(9,10,11,12,13,14);
		List<Integer> list2=Arrays.asList(15,16,17,18,19,20);
		
		List<List<Integer>> lists=Arrays.asList(list,list1,list2);
		
		//lists.stream().map(l->l.size()).forEach(System.out::println);
		
		 Stream<Object> s=lists.stream().map(l->l.stream());
		 s.forEach(System.out::println);
		
		Stream<Object> flatstream=lists.stream().flatMap(l->l.stream());
		flatstream.forEach(System.out::print);

	}

}
