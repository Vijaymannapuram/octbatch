package com.test.exp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LightApp1 {
	public static void main(String[] args)throws Exception {
		
		FileInputStream fin = new FileInputStream("light.ser");
		ObjectInputStream iStream = new ObjectInputStream(fin);
		Light light = (Light)iStream.readObject();
		light.printStatus();
		fin.close();
	}

}
