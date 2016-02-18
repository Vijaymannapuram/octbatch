package com.test.exp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ServiceLayer {
    public int getEmployeeNumber(String name) throws ServiceException,DataException{
    	DataLayer dataLayer = new DataLayer();
    	dataLayer.getEmployeeNumber(name);
    	
    	//
    try{	
    	Class.forName("com.test.bad");
    }catch(ClassNotFoundException ex){
    	buildServiceException("900","Failed to Load Service Class");
    }
    	return 0;
    	
    }

	private void buildServiceException(String errCode,String errMsg) throws ServiceException {
		ServiceException cex = new ServiceException(errCode,errMsg);//);
		throw cex;
	}
   
}
