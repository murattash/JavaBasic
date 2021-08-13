package com.neotech.lesson20;

public class Homework1 {
	
	
	static String getVowels(String str) {
		//We want to keep only vowels in the String
		
		String result = str.replaceAll("[^AEOIUaeoiu]", "");
		
		return result;
	}
	
	public static void main(String[] args) {
		String str1 = "I am very happy";
		
		System.out.println(getVowels(str1)); //since they are in the same class i dont need to use Homework.getVowels. But we would need to in a different class 
		
	}

	
}
