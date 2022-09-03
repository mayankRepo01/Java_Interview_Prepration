package collections;

import java.util.*;

public class learnLinkedListQueue {

	public static void main(String[] args) {
		
	Queue<Integer> q=new LinkedList<Integer>();
	q.offer(12);
	q.offer(24);
	q.offer(36);
	q.offer(48);
	
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q);
	
	System.out.println(q.peek());
	
	List<Integer> ll=new ArrayList<Integer>(Arrays.asList(2,4,7,9,77));
	
	for (int i = 0; i < ll.size(); i++) {
		System.out.println(ll);
	}	 
	
	
	
	}

}
