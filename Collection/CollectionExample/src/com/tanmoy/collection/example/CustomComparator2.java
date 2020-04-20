/**
 * 
 */
package com.tanmoy.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Admin
 *
 */
public class CustomComparator2 {

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
		Comparator<Integer> myComp = (obj1, obj2)-> obj1<obj2?-1 : obj1>obj2?1:0;
		Collections.sort(myList, myComp);
		System.out.println("Sorted Order: " + myList);
		System.out.println("Active thread count :" + Thread.activeCount());
		System.out.println("Active thread name :" + Thread.currentThread().getName());
		myList.stream().forEach(s->System.out.printf("%s\t", s));
		System.out.println();
		myList.stream().filter(i-> i%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
