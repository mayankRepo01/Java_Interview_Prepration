/**
 * 
 */
package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author mayank.g.mishra
 *
 */
public class learnPriorityQueue {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq=new PriorityQueue<>();
//		//NORMALLY priority queue has smallest element at first position(Min Heap)
//		pq.offer(24);
//		pq.offer(36);
//		pq.offer(48);
//		pq.offer(12);
//		pq.offer(10);
//		System.out.println(pq);
//		//so poll will give us the smallest element 
//		pq.poll();
//		System.out.println(pq);
//		pq.poll();
//		System.out.println(pq);
//		pq.poll();
//		System.out.println(pq);
//		pq.poll();
//		System.out.println(pq);
//		
//		//this will give us the next smallest element
//		System.out.println("Peek :"+pq.peek());
		
		//After passing the comparator it became max heap and largest element has highest priority
		PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(24);
		pq.offer(36);
		pq.offer(48);
		pq.offer(12);
		pq.offer(10);
		System.out.println(pq);
		//so poll will give us the largest element now
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		//this will give us the next smallest element
		System.out.println("Peek :"+pq.peek());
		
		
		
		

	}

}
