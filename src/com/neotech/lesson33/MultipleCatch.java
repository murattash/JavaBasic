package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		String file = System.getProperty("user.dir") + "/configs/conf.properties";
		
		
		try {
			
			FileInputStream fis = new FileInputStream(file);
			
			
			fis.close();
			
			Properties prop = new Properties();
			prop.load(fis);
			
			
		
		} 
			//Always - only one catch block is executed
		
		//careful on sorting the exception types - if a superclass is sorted before a subclass of it, then that 
		//catch will never get executed 
		
		
//		catch (Exception ex) {
//			ex.getMessage();
//		}
		
		
		catch (FileNotFoundException e) { // if the file is not right then it will give the error
			
			System.out.println(e.getMessage());
			System.out.println("The file was not found");

		}
		 catch (IOException ioe) {
			 
			 System.out.println(ioe.getMessage());
			 System.out.println("We could not load properties");
			 
		 }
		
		System.out.println("End of code");
		
		
		
		
		
	}

}
