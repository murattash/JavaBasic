package com.neotech.lesson18;

public class Homework2 {
	public static void main(String[] args) {
		
		String str = "Today is Saturday and we have a Java Class!!!";
		
		//Steps: 1. Make it possible to access each word by index
		//		 2. Reverse each word and print it 
		
		String [] strArray = str.split(" ");
		Homework2 h2 = new Homework2 ();
		
		for (String el : strArray) {
				//1st way:
				//for (int i =el.length() - 1; i >= 0; i--) {
					//System.out.print(el.charAt(i));
					
					String reverseString = h2.reverseString(el);
					System.out.print(reverseString + " ");
					
				}
				
		
		}		
	
	String reverseString(String str) {   //create this method so we don't have to create it multiple times in main if we have different data
			
			String resultStr = "";
		
			char[] charArray = str.toCharArray();
			
			for (int i = charArray.length -1; i >= 0; i--) {
				resultStr +=charArray[i];
			
			}
			
			return resultStr;
			
	}
	

}
