package com.test.oops.V2;

public class CarAppV2 {

	public static void main(String[] args) {
		Honda honda = new Honda();
		execute(honda);
		
		Nissan nissan = new Nissan();
		execute(nissan);
		
	}
	public static void execute(Car car){
		car.execute();
		
		if(car instanceof Nissan){
			Nissan nissan = (Nissan) car;
		nissan.boseAudio();
		}else if (car instanceof Honda){
			Honda honda = (Honda) car;
			honda.moonRoof();
			
		}
		car.stop();
	} 
	
	
}
