package com.test.oops.V4;

public class Nissan extends Car{
	
	public void stop(){
		System.out.println("***Nissan Stop***");
	}
	public void move(){
		System.out.println("***Nissan move ***");
	}
	@Override
	public void start() {
		System.out.println("***Nissan*** Start***");
	}
	

}
