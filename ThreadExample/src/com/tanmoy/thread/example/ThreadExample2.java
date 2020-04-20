/**
 * 
 */
package com.tanmoy.thread.example;

import java.util.stream.IntStream;

/**
 * @author Admin
 *
 */
public class ThreadExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r = () -> {
			/*
			 * for (int i=0; i<5; i++) { System.out.println("This is child thread"); }
			 */
			IntStream.range(0, 5).forEach(s -> System.out.println("This is child thread"));
			System.out.println("Active thread name: " + Thread.currentThread().getName());
		};
		Thread t = new Thread (r, "Child Thread");
		t.start();
		for(int i=0; i<5; i++)
		{
			System.out.println("This is main thread");
		}
		System.out.println("Active thread count: " + Thread.activeCount());
		System.out.println("Active thread name: " + Thread.currentThread().getName());
		
		
	}

}
