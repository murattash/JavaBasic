package com.neotech.lesson33;

public class InfoAboutException {
	
	public static void main(String[] args) {
		
		String hello = "hello";
		
			//unhandled exception 
		//char h = hello.charAt(10);
		//System.out.println(h);
		
		//try - catch: we write them this way
		try {
			
			
			char c = hello.charAt(15);
			System.out.println(c);
			//inner try - catch 
			
//			try {
//				
//			}
//			
//			catch() {
//				
//			}
			
			
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("End of code");
		
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
			
		}
		
		catch(Exception exception) {
			
			System.out.println("something happend - I dont know what");
		}
		
		
		
		
		
		
		
		
	}

}
