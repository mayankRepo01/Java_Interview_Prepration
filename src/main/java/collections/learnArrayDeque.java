/**
 * 
 */
package collections;

import java.util.ArrayDeque;

/**
 * @author mayank.g.mishra
 *
 */
public class learnArrayDeque {

	public static void main(String[] args) {

	//This Array Queue we can add and remmove elements from both sides
	ArrayDeque<Integer> adq=new ArrayDeque<>();
	adq.offer(23);
	adq.offerFirst(12);
	adq.offerLast(45);
	adq.offer(26);
	System.out.println(adq);
	
	System.out.println(adq.peek());
	System.out.println(adq.peekFirst());
	System.out.println(adq.peekLast());
	
	System.out.println(adq.poll());
	System.out.println("Poll() after removing "+adq);
	
	System.out.println(adq.pollFirst());
	System.out.println("PollFirst() after removing "+adq);
	
	System.out.println(adq.pollLast());
	System.out.println("PollLast() after removing "+adq);
	
	}

}
