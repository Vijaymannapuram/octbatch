package com.test.oops.V1;

public abstract class  Car {

	public void start(){
		System.out.println("Start () impl is missing..");
	}
	
	public void move(){
		System.out.println("Move Method....!");
	}
	public void stop(){
		System.out.println("Stop Method....!");
	}
	@Override
	public String toString() {
		
		return "Car";
	}
	
}
