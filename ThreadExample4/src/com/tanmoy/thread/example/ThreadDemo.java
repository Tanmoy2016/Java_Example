package com.tanmoy.thread.example;

import java.util.stream.IntStream;

/*
 * This example shows how to name a thread
 */

class MyThread extends Thread
{
	public MyThread(String threadName)
	{ 
		super(threadName);
	}
	
	public void run()
	{
		IntStream.range(1, 10).forEach(s-> System.out.println("Child Thread"));
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current thread count: " + Thread.activeCount());
	}
}
class ThreadDemo {
	
	
	public static void main(String... args)
	{
		Thread t = new MyThread("Child Thread");
		t.start();
		Thread.currentThread().setName("Parent Thread");
		IntStream.range(1, 10).forEach(s-> System.out.println("Main Thread"));
		System.out.println("Current Thread name: " + Thread.currentThread().getName());
		System.out.println("Current thread count: " + Thread.activeCount());
		
	}

}
