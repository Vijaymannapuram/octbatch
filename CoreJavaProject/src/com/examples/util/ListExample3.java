package com.examples.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		List<Student> stuList = new LinkedList<Student>();
        stuList.add(new Student(101,"Jhon",2345,"MS"));
        stuList.add(new Student(107,"Tim",189,"MA"));
        stuList.add(new Student(105,"Zhon",425,"MBA"));
        stuList.add(new Student(103,"Steve",789,"MSC"));
        stuList.add(new Student(201,"Dany",456,"BA"));
        stuList.add(new Student(102,"Ram",123,"SCM"));
	System.out.println(" Size " + stuList.size());
	System.out.println(" Data " + stuList);
	
	if(stuList.contains(new Student(105,"Zhon",2345,"MS"))){
		System.out.println(" Element found ");
	}else{
		System.out.println("Not found");
	}
	System.out.println(" Before Sort " + stuList);
	Collections.sort(stuList,new StudentFeeSort());
	System.out.println(" After Sort " + stuList);
	}
	

}
