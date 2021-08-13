package com.neotech.lesson31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		// We want to write to an existing file
		// and add more pair/entries
		String filePath = "/Users/mtashpulatov/eclipse-workspace/JavaBasic/configs/example.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();
		
		//if we dont load, the data that was on the file will be lost
		prop.load(fis);
		
		prop.setProperty("phonenumber", "1234567890");
		
		//To write to the file we need FileOutputStream. Whatever I added, like phone number
		FileOutputStream fos = new FileOutputStream(filePath); 
		
		prop.store(fos, "I just added a new property");
		
		
	}

}
