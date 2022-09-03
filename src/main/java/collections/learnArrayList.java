package collections;

import java.util.ArrayList;


public class learnArrayList {

	public static void main(String[] args) {
//	ArrayList<Integer> l=new ArrayList<>();
//	l.add(1);
//	l.add(2);
//	l.add(3);
//	System.out.println(l);
//	
//	l.add(1,19);
//	System.out.println(l);
//	
//	ArrayList<Integer> l1=new ArrayList();
//	l1.add(89);
//	l1.add(9);
//	l1.add(8);
//	
//	l1.addAll(1,l);
//	System.out.println(l1);
//	System.out.println(l1.get(1));
		
	ArrayList<Integer> l3=new ArrayList<>();
	l3.add(10);
	l3.add(23);
	l3.add(34);
	l3.add(40);
	System.out.println(l3);
	
//	l3.remove(0); //remove index
//	System.out.println(l3);
//	l3.remove(Integer.valueOf(23));// remove value
//	System.out.println(l3);
//	l3.removeIf(a->a%2==0);
//	System.out.println(l3);
//	
//	l3.clear();

	l3.set(1,67);
	
	System.out.println(l3);
	System.out.println(l3.contains(50));
	
	
	

	}

}


