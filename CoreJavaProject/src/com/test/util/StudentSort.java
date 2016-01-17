package com.test.util;

import java.util.Comparator;

public class StudentSort implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		System.out.println("Compare ******");
		if(student1.getSno() > student2.getSno() && student1.getSname().compareTo(student2.getSname())>0){
		return 1;
	}else if(student1.getSno() < student2.getSno()&& student1.getSname().compareTo(student2.getSname())<0){
	return -1;
	}else{
		return 0; 
	}
	}
}
	
		


