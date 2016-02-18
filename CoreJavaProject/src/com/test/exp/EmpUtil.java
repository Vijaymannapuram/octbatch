package com.test.exp;

public class EmpUtil {
	  public void validateEno(int eno)throws CustomException{
		  if (eno < 0 || eno > 500){
			 /* Exception ex = new Exception("Eno < 0 || Eno > 500");
			  throw ex;*/
		  CustomException cex = new CustomException("1000", "Eno < 0 || Eno > 500");
		  throw cex;
		  }
	  }

}
