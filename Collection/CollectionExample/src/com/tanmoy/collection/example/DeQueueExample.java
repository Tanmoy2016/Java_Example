/**
 * 
 */
package com.tanmoy.collection.example;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Admin
 *
 */
public class DeQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.addFirst("ABCD");
		deque.addLast("ABCD");
		deque.offerFirst("AMD");
		deque.offerLast("ACD");
		deque.add("MNM");
		deque.push("AKN");
		deque.forEach(System.out :: println);
		System.out.println("Peek Operations ---");
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());

	}

}
