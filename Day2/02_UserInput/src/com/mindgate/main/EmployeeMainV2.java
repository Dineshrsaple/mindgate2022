package com.mindgate.main;

import com.mindgate.pojo.Employee;

public class EmployeeMainV2 {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "Dinesh", 1000);
		System.out.println(employee);// by default compiler add toString() after object

	}
}
