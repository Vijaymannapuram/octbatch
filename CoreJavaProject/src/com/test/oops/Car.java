package com.test.oops;

public class Car {

	public void start(){
		System.out.println("Start Method....!");
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
