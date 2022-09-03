package com.Java8.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(89);
		l.add(9);
		l.add(8);

		//here we have provided the implementation as lambda expression
		Consumer<Integer> con=(i)->System.out.println(i);
		l.forEach(con);

	}

}
