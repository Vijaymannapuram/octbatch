package com.test.oops.V4;

public class Honda extends Car{

	@Override
	public void move() {
		System.out.println("Honda Move...");
	}
	public void stop(){
	System.out.println("***Honda Stop");
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
