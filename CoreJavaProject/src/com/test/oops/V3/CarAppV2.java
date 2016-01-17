package com.test.oops.V3;

public class CarAppV2 {

	public static void main(String[] args) {
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	public static void execute(Car car){
		car.start();
		car.move();
		car.stop();
	} 
	
	
}
