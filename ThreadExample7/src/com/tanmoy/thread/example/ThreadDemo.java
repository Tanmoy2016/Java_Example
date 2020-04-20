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
		IntStream.range(1, 10).forEach(s -> System.out.println("Child Thread"));
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current Thread id: " + Thread.currentThread().getId());
		System.out.println("Currrent active thread count (1): " + Thread.activeCount());
	}
}
class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t = new MyThread();
		t.setName("Child");
		Thread.currentThread().setName("Parent");
		t.setDaemon(Boolean.FALSE);
		t.setPriority(1);
		t.start();
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current Thread id: " + Thread.currentThread().getId());
		System.out.println("Currrent active thread count (2): " + Thread.activeCount());
		// calling t.setDaemon or t.start will result in IllegalThreadStateException which is a runtime exception
		//t.setDaemon(Boolean.TRUE);
		//t.start();
	}

}
