package com.test.api;

import com.test.oops.Employee;

public class SpringTest {
public static void main(String[] args) {
	String input = "101,Jhon,5600";
	String []data = input.split(",");
	Employee emp = new Employee(Integer.parseInt(data[0]),data[1],Float.parseFloat(data[2]));
	System.out.println(emp);
	
}
}
