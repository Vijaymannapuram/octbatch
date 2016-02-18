package com.test.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample4 {
	
  public static void main(String[] args) throws FileNotFoundException{
	  testMethod1();
	  int result = testMethod();
	  System.out.println(" Result "+ result);
}

  private static int testMethod() {
	try{
	  FileInputStream fin = new FileInputStream(" rama ");
	  fin.read();
	  return 1;
	  }catch(FileNotFoundException ex){
		  System.out.println("File not found::::");
		  ex.printStackTrace();
		  return 1;
		  }catch(IOException ie){
			  System.out.println(" Failed to read File :::: IO Error");
		  ie.printStackTrace();
		  return 1;
		  }finally{
			  System.out.println(" Execute Always ");
		  }}
	
	 private static void testMethod1() {
			try{
			  FileInputStream fin = new FileInputStream(" rama ");
			  fin.read();
			  System.exit(0);
			  }catch(FileNotFoundException ex){
				  System.out.println("File not found::::");
				  ex.printStackTrace();
				  System.exit(0);
				  }catch(IOException ie){
					  System.out.println(" Failed to read File :::: IO Error");
				  ie.printStackTrace();
				  System.exit(0);
				  }finally{
					  System.out.println(" Execute Always ");
				  }
}}
