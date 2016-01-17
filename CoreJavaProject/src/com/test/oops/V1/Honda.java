	package com.test.oops.V1;

public class Honda extends Car{

	@Override
	public void move() {
		System.out.println("Honda Move...");
	}
	public void moonRoof(){
	System.out.println("Moon Roof....!");
	}
	@Override
	public String toString(){
		return "Honda";
	}
	@Override
	public void start() {
		System.out.println("Honda start Method...!");

	}
}
