package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {

	public static void main(String[] args) {
		//create a set of unique elements
		//Set<Integer> s=new HashSet<>();
		
		//it as properties of set and linkedlist
		//Set<Integer> s=new LinkedHashSet<>();
		
		//This uses BST internally
//		Set<Integer> s=new TreeSet<>();
//		
//		s.add(32);
//		s.add(32);
//		s.add(45);
//		s.add(98);
//		s.add(33);
//		System.out.println(s);
//		
//		s.remove(45);
//		System.out.println(s);
//		System.out.println(s.contains(33));
//		System.out.println(s.size());
//		s.clear();
		
		
		Set<Student> set=new HashSet<>();
		Student s1=new Student("m",1);
		Student s2=new Student("maa",2);
		Student s3=new Student("maa",2);
		Student s4=new Student("maaaa",3);
		Student s5=new Student("maaaa",4);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		System.out.println(set);
		
		
		
		
		

	}

}
