package com.test.exp;

public class EmployeeApp {

	public static void main(String[] args) {
	 ServiceLayer s = new ServiceLayer();
	 try{
		 s.getEmployeeNumber(null);
	 }catch(DataException de){
		 de.printStackTrace();
	 }catch(ServiceException se){
		 se.printStackTrace();
	 }
	}

}
