package com.test.oops;

public class CarApp {

	public static void main(String[] args) {
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	public static void execute(Nissan nissan){
		nissan.start();
		nissan.move();
		nissan.stop();
	} 
	
	public static void execute(Honda honda){
		honda.start();
		honda.move();
		honda.stop();
	} 

}
