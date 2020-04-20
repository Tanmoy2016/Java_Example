/**
 * 
 */
package com.tanmoy.collection.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Admin
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comparator<String> c1 = (ob1, ob2) -> ob2.compareTo(ob1);
		Comparator<Integer> i = (ob1, ob2) -> (ob1<ob2)?-1:(ob1>ob2)?1:0;
		Queue<String> queue = new PriorityQueue<String>(c1);
		queue.add("S");
		queue.add("D");
		queue.add("P");
		queue.add("K");
		queue.add("N");
		queue.forEach(System.out :: println);
		queue.offer("B");
		System.out.println("-----------------");
		queue.forEach(System.out :: println);
		System.out.println("-----------------");
		while(!queue.isEmpty())
		{
			System.out.println(queue.poll());
		}
		Queue<Integer> queue2 = new PriorityQueue<Integer>(i);
		queue2.add(10);
		queue2.add(21);
		queue2.add(12);
		queue2.add(17);
		queue2.forEach(System.out :: println);
		queue2.offer(13);
		System.out.println("-----------------");
		queue2.forEach(System.out :: println);
		System.out.println("-----------------");
		while(!queue2.isEmpty())
		{
			System.out.println(queue2.poll());
		}
	}

}
