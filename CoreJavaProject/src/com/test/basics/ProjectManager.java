package com.test.basics;

import com.test.oops.Employee;

public class ProjectManager extends Employee {
	public float getTotalTaxAmount(){
		return getStateTaxAmount()+getFedTaxAmount();
		
	}

}
