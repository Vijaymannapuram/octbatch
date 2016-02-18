package com.test.exp;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		System.out.println(" Start ################");
		
		try{
			//step 1
		String name = "Rama";
		System.out.println(" Upper case :" + name.toUpperCase());
		//step 2
			int result = 10/2;
			System.out.println(" Result :"+ result);
			
	    //step 3

			int score[] = {34,56,78};
			System.out.println(" Score [2] "+ score[2]);
			
		}catch(NullPointerException ex){
			System.out.println(" Exception :::::");
			ex.printStackTrace();
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println(" Exception Occured During Div Logic:::::");
			}catch(ArrayIndexOutOfBoundsException ao){
				ao.printStackTrace();
			}
		
		System.out.println(" End ################");
		
	}

}
