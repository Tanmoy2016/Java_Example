/**
 * 
 */
package com.tanmoy.thread.example;

import java.util.stream.IntStream;

/**
 * @author Admin
 *
 */

class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(() -> IntStream.range(1, 10).forEach(s -> System.out.println("Child thread")));
		t.start();
		System.out.println("Child thread priority: " + t.getPriority());
		System.out.println("Child Thread name: " + t.getName());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Child thread priority 2: " + t.getPriority());
		System.out.println("Main thread name: " + Thread.currentThread().getName());
		System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		// Thread.currentThread().setDaemon(true);
		System.out.println("Main thread priority 2: " + Thread.currentThread().getPriority());
		IntStream.range(1, 10).forEach(s -> System.out.println("Parent thread"));
	}

}
