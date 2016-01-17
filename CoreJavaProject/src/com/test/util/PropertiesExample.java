package com.test.util;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args)throws Exception{
		
		String 	envName = System.getProperty("app.env.name");
		
		Properties properties = new Properties();
		//properties.load(new FileInputStream("D:\\CONSULTANCIES\\ITECH\\Java By ITECH VEERA REDDY\\Java Programs\\New Java Programs\\CoreJavaProject\\src\\com\test\\util\\app-uat.properties"));
		System.out.println("Loading Envi :" + envName);
		//Class.Path
		
		properties.load(PropertiesExample.class.getResourceAsStream("app-"+envName+".properties"));
		
		System.out.println(properties);
	
	
		
	}

}
