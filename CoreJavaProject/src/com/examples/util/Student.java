package com.examples.util;

public class Student implements Comparable<Student>{
	
		private int sno;
		private String sname;
        private int fee;
        private String course;
		public int getSno() {
			return sno;
		}
		public void setSno(int sno) {
			this.sno = sno;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getFee() {
			return fee;
		}
		public void setFee(int fee) {
			this.fee = fee;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public Student(int sno, String sname, int fee, String course) {
			super();
			this.sno = sno;
			this.sname = sname;
			this.fee = fee;
			this.course = course;
		}
		public Student() {
			super();
		}
		
		
		@Override
		public int hashCode() {
			int hashValue = this.sno + this.sname.hashCode();
			System.out.println( "Hash Code " + hashValue);
			return hashValue;
		}
		@Override
		public boolean equals(Object obj) {
			System.out.println( "Equals ----->" + this.toString() + " vs " +obj);
          if (obj instanceof Student){
        	  Student stu = (Student) obj;
          if(this.sno == stu.getSno() && this.sname.equals(stu.getSname())){
        	  return true;
          }
          }
             return false;
		}
		@Override
		public String toString() {
			return "Student [sno=" + sno + ", sname=" + sname + ", fee=" + fee + ", course=" + course + "]";
		}
		@Override
		public int compareTo(Student stu){
			System.out.println("Compare ******");
			if(this.sno > stu.getSno()){
			return 1;
		}else if(this.sno < stu.getSno()){
		return -1;
		}else{
			return 0; 
		}
		
	}
		}


