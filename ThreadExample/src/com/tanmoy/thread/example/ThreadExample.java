/**
 * 
 */
package com.tanmoy.thread.example;

/**
 * @author Admin
 *
 */

class myRunnable implements Runnable
{

	@Override
	public void run() {
		for(int i=0; i<5; i++)
		{
			System.out.println("This is child thread");
		}
		System.out.println("Active Thread name: " + Thread.currentThread().getName());
	}
}
public class ThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		myRunnable r = new myRunnable();
		Thread t = new Thread(r, "Child Thread");
		t.start();
		for (int i=0; i<5 ; i++)
		{
			System.out.println("This is main thread");
		}
		System.out.println("Active thread count: " + Thread.activeCount());
		System.out.println("Active Thread name: " + Thread.currentThread().getName());
	}

}
