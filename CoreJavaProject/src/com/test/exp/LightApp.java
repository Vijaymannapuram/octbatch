package com.test.exp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class LightApp {
	public static void main(String[] args)throws Exception {
		Light light = new Light();
		light.On();
		light.printStatus();
		FileOutputStream fout = new FileOutputStream("light.ser");
		ObjectOutputStream oStream = new ObjectOutputStream(fout);
		oStream.writeObject(light);
		fout.close();
	}

}
