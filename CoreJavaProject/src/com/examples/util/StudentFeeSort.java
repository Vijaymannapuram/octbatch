package com.examples.util;

import java.util.Comparator;

public class StudentFeeSort implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getFee() < student2.getFee()){
			return -1;
		}else if(student1.getFee() > student2.getFee()){
			return 1;
		}else
			return 0;
		
	}

}
