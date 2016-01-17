package com.test.api;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;

public class ReadFileApp {

	public static void main(String[] args) throws Exception				{
		/*FileInputStream fileInputStream = new FileInputStream("D:\\CONSULTANCIES\\ITECH\\Java By ITECH VEERA REDDY\\Java Programs\\New Java Programs\\CoreJavaProject\\src\\com\\test\\api\\sample.txt");
		int data;
		while((data=fileInputStream.read()) !=-1){
		System.out.print((char)data);
	}
	fileInputStream.close();*/
	String fileData = FileUtils.readFileToString(new File("D:\\CONSULTANCIES\\ITECH\\Java By ITECH VEERA REDDY\\Java Programs\\New Java Programs\\CoreJavaProject\\src\\com\\test\\api\\sample.txt"));	
	System.out.println(fileData);
	}
	

}
