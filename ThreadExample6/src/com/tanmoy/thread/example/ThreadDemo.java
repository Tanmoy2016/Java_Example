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
	public void start()
	{
		System.out.println("This is overriden start method");
		super.start();
	}
	public void run()
	{
		IntStream.range(1, 10).forEach(s-> System.out.println("Child Thread"));
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current thread count: " + Thread.activeCount());
	}
}
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread t = new MyThread();
		t.setName("Child Thread");
		t.start();
		Thread.currentThread().setName("Parent Thread");
		IntStream.range(1, 10).forEach(s-> System.out.println("Parent Thread"));
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current thread count: " + Thread.activeCount());
	}
}
