package com.test.oops;

public class PenApp {
	
	public static void main(String[] args) {
		Pen penobj = new Pen();
		//penobj.color = "Red";
         penobj.setcolor("Red");
         penobj.setcolor("Yellow");
		penobj.write();
		
		Pen penobj1 = new Pen();
		//penobj1.color = "Green";
		penobj1.write();
		
		Pen penobj2 = new Pen("Blue");
		penobj2.write();
		}

}
