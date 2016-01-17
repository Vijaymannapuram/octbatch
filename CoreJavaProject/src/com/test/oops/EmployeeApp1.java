package com.test.oops;

public class EmployeeApp1 {

	public static void main(String[] args) {
		
        Employee emp1 = new Employee(777,"Tim",8900);
        Employee emp2 = new Employee(777,"Tim",8900);
	     
        /*if(emp1==emp2){
	    	  System.out.println("Equal");
	      }else{
	    	  System.out.println("Not Equal");
	      }
	      if(emp1.equals(emp2)){
	    	  System.out.println("Equal");
	      }else{
	    	  System.out.println("Not Equal");
	      }*/
        if(emp1.equals(emp2)){
        	System.out.println("Equals");
        }else{
        	System.out.println("Not Equals");
        }
	    	  
	      }
	      
	}
	


