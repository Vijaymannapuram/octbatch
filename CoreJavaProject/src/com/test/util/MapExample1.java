package com.test.util;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;


public class MapExample1 {

	public static void main(String[] args) {
		Map<Student,String> dataMap = new Hashtable<Student,String>();
		
		dataMap.put(new Student(890, "MS", 0, "Rama"),"Rama");
		dataMap.put(new Student(123, "MS", 0, "Steve"), "Steve");
		dataMap.put(new Student(345, "MS", 0, "Jhon"), "Jhon");
		dataMap.put(new Student(890, "MS",	 0, "Ken"), "Ken");
		
		System.out.println(dataMap);

	}

}
