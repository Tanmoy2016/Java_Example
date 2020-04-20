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
		IntStream.range(1, 10).forEach(s -> System.out.println("Parent thread"));
	}

}
