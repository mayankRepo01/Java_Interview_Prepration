package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<>();
//		l1.add(23);
//		l1.add(24);
//		l1.add(25);
//		l1.add(26);
//		
//		System.out.println(Collections.min(l1));
//		System.out.println(Collections.max(l1));
//		System.out.println(Collections.frequency(l1,23));
//		//sorting ascending
//		Collections.sort(l1);
//		//sorting descending
//		Collections.sort(l1,Comparator.reverseOrder());
//		System.out.println(l1);
//		
		
		List<Student> s=new ArrayList<>();
		s.add(new Student("m",1));
		s.add(new Student("ma",2));
		s.add(new Student("maa",4));
		s.add(new Student("maaa",3));
		
		Student t=new Student("ram",1);
		Student t1=new Student("ra",2);
		
		
		//System.out.println(t.compareTo(t1));
		
		//using comparable class implemented in student 
		//Collections.sort(s);
		
		///using comparator class and anonymous class
		Collections.sort(s,new Comparator<Student>() {
			public int compare(Student a,Student b) {
				return a.getName().compareTo(b.getName());
				
			}
		});
		//or using lambda expression as comparator is function interface
		Collections.sort(s,(a,b)->a.getName().compareTo(b.name));
		System.out.println(s);
		
		

	}

}
