package com.test.oops.V2;

public abstract class  Car {

	public abstract void start();
	
	public void execute(){
		start();
		move();
		stop();
		
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
