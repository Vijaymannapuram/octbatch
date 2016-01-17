package com.test.oops;

public class Pen{

	
		private String color;
		public void setcolor(String color){
			
		if(this.color==null){
		this.color = color;
		}else{
			System.out.println("Only you can update color one time");
		}
		System.out.println("updated color value..");
		}
		
		public void write(){
			System.out.println(" writing in" + color);
		}
		public Pen(){
			System.out.println("zero Argument Constructor ");
		}
		public Pen(String color){
			this.color=color;
			System.out.println("parameterized Constructor ");
			
		}
	}


