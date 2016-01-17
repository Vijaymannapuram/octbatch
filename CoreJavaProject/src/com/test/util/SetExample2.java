package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set<Student> stuSet = new TreeSet<Student>(new StudentFeeSort());//new HashSet<Student>();
         stuSet.add(new Student(101,"Jhon",2345,"MS"));
        stuSet.add(new Student(107,"Tim",189,"MA"));
        stuSet.add(new Student(105,"Zhon",425,"MBA"));
        stuSet.add(new Student(103,"Steve",789,"MSC"));
        stuSet.add(new Student(201,"Dany",456,"BA"));
        stuSet.add(new Student(102,"Ram",123,"SCM"));
        
        
        stuSet.add(new Student(101,"Jhon",2345,"MS"));
        stuSet.add(new Student(107,"Tim",189,"MA"));
        stuSet.add(new Student(105,"Zhon",425,"MBA"));
        stuSet.add(new Student(103,"Steve",789,"MSC"));
        stuSet.add(new Student(201,"Dany",456,"BA"));
        stuSet.add(new Student(102,"Ram",123,"SCM"));
	
        System.out.println(" Size " + stuSet.size());
        System.out.println(" Data " + stuSet);
	 
	}
	

}
