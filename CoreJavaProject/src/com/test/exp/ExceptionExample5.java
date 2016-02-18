package com.test.exp;

public class ExceptionExample5 {

	public static void main(String[] args) {
		
		//step 1
		String name = null;//"Rama";
		if(name !=null)
		System.out.println(" Upper case :" + name.toUpperCase());
		
		int a = 10;
		int b = 0;
		if (b>0){
			int result = a/b;
			System.out.println(" Result : " +result);
		}
		
		//step 3

	int score[] = {34,56,78};
	if(score.length > 10)
	System.out.println(" Score [2] "+ score[9]);
	
	}

}
