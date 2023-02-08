package collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {
	public static void main(String[] arrgs) {
		//Linked List - present in List as well Queue interface
		// can be implement with both
		
		//Queue follow - FIFO principle
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(12); // used to add the element
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);
		
		//remove element
		System.out.println(queue.poll()); // will remove first element
		
		System.out.println(queue);
		System.out.println(queue.peek()); //next element in the queue

	}
}