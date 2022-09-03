package com.Java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reduction_Demo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8);
		Stream<Integer> s=Stream.empty();
		int sum=s.reduce(0,(l1,l2)->l1+l2);
		System.out.println("Sum by reduce="+sum);
		int sum1=list.stream().collect(Collectors.summingInt(l->l));
		System.out.println("Sum by Collectors="+sum1);
	}

}
