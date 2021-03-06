/**
 * 
 */
package com.tanmoy.thread.example;

import java.util.stream.IntStream;

/**
 * @author Admin
 *
 */

class MyThread extends Thread
{
	public void run()
	{
		IntStream.range(1, 10).forEach(s-> System.out.println("Child Thread"));
		System.out.println("Current Thread Name : " + Thread.currentThread().getName());
		System.out.println("Current active thread count: " + Thread.activeCount());
	}
}
class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = new MyThread();
		t.setName("Child Thread");
		t.start();
		IntStream.range(1, 10).forEach(s-> System.out.println("Main Thread"));
		System.out.println("Current Thread Name: " + Thread.currentThread().getName());
		System.out.println("Current active thread count: " + Thread.activeCount());

	}

}
