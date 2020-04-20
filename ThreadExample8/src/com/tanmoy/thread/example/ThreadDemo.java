/**
 * 
 */
package com.tanmoy.thread.example;

import java.util.stream.IntStream;

/**
 * @author Admin
 *
 */

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		IntStream.range(1, 10).forEach(s -> System.out.println("Child thread"));
	}
}


class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
		IntStream.range(1, 10).forEach(s -> System.out.println("Parent thread"));
	}

}
