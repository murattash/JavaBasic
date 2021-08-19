package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Homework {
	
	public static void main(String[] args) throws IOException {
		
		//1. Create the path to the file
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String fullPath = projectPath + "/configs/homework.txt";
		System.out.println(fullPath);
		
		//2. Create the object of FileInputStream
		FileInputStream fis = new FileInputStream(fullPath);
		
		Properties prop = new Properties(); //this is part of Map
		prop.load(fis);
		System.out.println(prop);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		Set<Object> keys = prop.keySet();
		//enhanced for loop
		for(Object k : keys) {
			//System.out.println(k);
			System.out.println(k + " => " + prop.get(k));
		}
		
		
		System.out.println("-----Selenium Steps-------");
		System.out.println("I am opening this browser: " + prop.getProperty("browser"));
		System.out.println("I will go to this page: " + prop.getProperty("url"));
		System.out.println("I will enter the username: " + prop.getProperty("username"));
		System.out.println("I will enter the password: " + prop.getProperty("password"));
		
		System.out.println("-----Write to the file------");
		
		//1. add a new pair into the properties
		prop.setProperty("phonenumber", "412342412");
		
		//2. we need FileOutputStream to write to the file
		FileOutputStream fos = new FileOutputStream(projectPath + "/configs/homework2.txt"); //need to Refresh the folder  
		
		//3. persist (store/save) into a file 
		prop.store(fos, "I am storing into a new file");
		
	
		
		
		
	}

}
