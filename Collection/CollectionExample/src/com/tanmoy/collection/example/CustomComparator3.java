/**
 * 
 */
package com.tanmoy.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Admin
 *
 */
class Employee{
	
	private String firstName;
	private String lastName;
	Integer empId;
	
	public Employee(final String firstName, final String lastName, final Integer empId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}
	
	public String toString()
	{
		return "Employee Name: " + firstName + ", " + lastName + " -- Employee Id: " + empId;
	}
}
public class CustomComparator3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Tanmoy", "Ghoshal", 209311));
		empList.add(new Employee("Charu", "Dhingra", 209312));
		empList.add(new Employee("Parth", "Sharma", 209315));
		empList.add(new Employee("Partha", "Das", 209313));
		System.out.println(empList);
		Collections.sort(empList, (obj1, obj2) -> (obj1.empId<obj2.empId)?-1:(obj1.empId>obj2.empId)?1:0);
		System.out.println(empList);
	}

}
