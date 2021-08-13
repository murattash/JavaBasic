package com.neotech.lesson31;

public class FileReading {
	
	public static void main(String[] args) {
		
		String filePath = "/Users/mtashpulatov/eclipse-workspace/JavaBasic/configs/example.properties";
		System.out.println(filePath);
		
		
		//finding user directory
		String userDirectory = System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		
		//Getting username
		String userName = System.getProperty("user.name");
		System.out.println(userName);
		
		
		//Getting operating system of your computer
		String os = System.getProperty("os.name");
		System.out.println(os);
		
		String dynamicPath = System.getProperty("user.dir") + "/configs/example.properties";
		System.out.println(dynamicPath);
		
		
	}

}
