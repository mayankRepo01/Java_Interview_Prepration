package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class learnArraysClass {

	public static void main(String[] args) {
	
	int a[]= {2,3,4,5,6,7,1,0};
	Arrays.sort(a);
	
	int index=Arrays.binarySearch(a, 6);
	System.out.println("Index of it is :"+index);
	int b[]= {};
	Arrays.fill(b,8);
	
	//This returns a fixed size List that can not be increased or decreased
	List<Integer> l=Arrays.asList(2,0,9,5,6);
	//this operation will through exception
	///l.add(4);
	
	
	//Alernate but work as normal ArrayList
	List<Integer> l1=new ArrayList<>(Arrays.asList(2,0,9,5,6));
	
	l1.add(23);
	
	System.out.println(l1);

	}

}
