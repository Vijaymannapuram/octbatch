package com.test.basics;

public class CalculateAppv1 {

	public static void main(String[] args) {
		
		add(5,6);
		add(1,2);
		add(5,10);
		
		int result = sub(5,10) + sub(1,2);
		System.out.println(" Result " +result );
	}
	public static void add(int x,int y){
		int c2 = x+y;
		
		System.out.println(" Result "+ c2);
	}
	public static int sub(int x,int y){
		int c2 = x - y;
		return c2;
		
		

}
}