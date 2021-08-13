package com.neotech.lesson17;

public class StringComparison {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = new String ("Hello");
		
		if (str1.equals(str2)) { //the values are the same that is why they are equal 
			System.out.println("String are equals");
		} else {
			System.out.println("String are not equal");
		}
		
		
		System.out.println("----Comparing using == operator----");
		
		
		if (str1 == str2) { //str1 is value in one place and str2 is the object in a different place 
			System.out.println("String are equals");
		} else {
			System.out.println("String are not equal");
		}
		
		
		System.out.println("----Comparing str1 == str3 ----");
		
		String str3 = "Hello";
		if (str1 == str3) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}
		
	}

}
