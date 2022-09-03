package com.Java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparator_Demo {

	public static void main(String[] args) {
//		Comparator c=new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return Integer.compare(o1.length(), o2.length());
//			};
//		};
		
		Comparator<String> c1=(String s1,String s2)-> 
		Integer.compare(s1.length(), s2.length());
		
		List<String> l1=Arrays.asList("*****","**","****","*");
		
		Collections.sort(l1, c1);
		
		System.out.println(l1);
	
}
	
}
