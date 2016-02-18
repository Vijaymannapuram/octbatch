package com.test.exp;

import java.io.Serializable;

public class Light implements Serializable{
    private boolean status;
    
    public Light(){
    	status = false;
    	
    }
    public void On(){
    	status = true;
    	
    }
    public void Off(){
    	status = false;	
    	
    }
    public void printStatus(){
    	System.out.println(" Light is " + ((status) ? " On " : "Off"));
    }
}
