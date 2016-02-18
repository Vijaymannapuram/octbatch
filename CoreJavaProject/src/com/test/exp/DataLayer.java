package com.test.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataLayer {
    public int getEmployeeNumber(String name) throws DataException{
    	if(name != null && name.equals("")){
    		buildCustomException("101","Invalid Name");
    	}
    	try{
    		FileInputStream fin = new FileInputStream("rama");
    		fin.read();
    	}catch(FileNotFoundException fe){
    		buildCustomException("101","File Not Found ");
    	}catch(IOException io){
    		buildCustomException("102","I/O Error");
    		DataException cex = new DataException("102","I/O Error");
    		throw cex;
    	}
    	return 0;
    	
    }

	private void buildCustomException(String errCode,String errMsg) throws DataException {
		DataException cex = new DataException(errCode,errMsg);//);
		throw cex;
	}
   
}
