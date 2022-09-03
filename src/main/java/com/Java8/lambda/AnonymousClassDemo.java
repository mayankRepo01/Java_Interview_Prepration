package com.Java8.lambda;



import java.util.ArrayList;
import java.util.function.Consumer;


//class conImpl implements Consumer<Integer>{
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//	}
//	
//}


//Instead of writing the whole class just to implement accept method

/// We can create an anonymous inner class and provide the implementation of method



public class AnonymousClassDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(89);
		l.add(9);
		l.add(8);

		//here we have provided the implementation in itself
		Consumer<Integer> con=new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}

		};
		l.forEach(con);

	}

}
