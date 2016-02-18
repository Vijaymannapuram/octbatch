package com.test.exp;

public class ExceptionExample {

	public static void main(String[] args) {
		
		//step 1
		try{
		String name = null;//"Rama";
		System.out.println(" Upper case :" + name.toUpperCase());
		}catch(Exception ex){
			System.out.println(" Exception :::::");
			ex.printStackTrace();
		}
		//step 2
		try{
		int result = 10/0;
		System.out.println(" Result :"+ result);
		}catch(ArithmeticException ae){
		ae.printStackTrace();
		System.out.println(" Exception Occured During Div Logic:::::");
		}
		
		//step 3

	int score[] = {34,56,78};
	System.out.println(" Score [2] "+ score[2]);
	
	}

}
