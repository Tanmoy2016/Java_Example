/**
 * 
 */
package com.tanmoy.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Admin
 *
 */

class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		/*
		 * if(i1 > i2) return 1; else if (i1 < i2) return -1; else return 0;
		 */
		return (i1<i2)?-1:(i1>i2)?1:0;
	}
	
}
public class CustomComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(5);
		myList.add(25);
		myList.add(22);
		myList.add(21);
		myList.add(11);
		System.out.println("Original Order: " + myList);
		Collections.sort(myList, new MyComparator());
		System.out.println("Sorted Order: " + myList);
		System.out.println("Active Thread count: " + Thread.activeCount());
		System.out.println("Active Thread name: " + Thread.currentThread().getName());
	}
}
