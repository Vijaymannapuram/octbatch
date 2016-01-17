package com.test.oops;

public class Employee {
		 int eno;
		 String ename;
		float salary;
		static int count;
		
		public static void printcount(){
			System.out.println("Count "+count);
		
		}
		
		 public Employee(int eno,String ename,float salary){
			 this.eno = eno;
			 this.ename = ename;
			 this.salary = salary;
		 }
		 public 	Employee(){
				//no - op
			}
	        public 	Employee(int eno){
				this.eno = eno;
			}
	public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
	public float getFedTaxAmount(){
		return (salary*30)/100;
		}
	public float getStateTaxAmount(){
		return (salary*8)/100;
		}
	public boolean equals(Employee emp){
		if(this.eno == emp.getEno()){
			return true;
		}
		return false;  
	}
	public boolean equals(String str){
		return false;
	}
	public boolean equals(Pen pen){
		return false;
	}
		
	}


 