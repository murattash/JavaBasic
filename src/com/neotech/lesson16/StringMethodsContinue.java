package com.neotech.lesson16;

public class StringMethodsContinue {
	
	public static void main(String[] args) {
		
		//contains()
		String sentence = "Today is 4th of Jule";
		boolean contains = sentence.contains("Today");
		System.out.println(contains);
		
		String sentence1 = "Today is 4th of Jule";
		boolean contains1 = sentence1.contains("today");
		System.out.println(contains1);
		
		
		//startsWith()
		boolean starts = sentence.startsWith("Today");		
		System.out.println("Starts " + starts);
		
		
		//endWith()
		boolean starts1 = sentence.endsWith("Today");
		System.out.println("ends " + starts1);
		
		
		//equals()
		String str1 = "Saturday";
		String str2 = "saturday";
		
		boolean equals = str1.equals(str2);
		System.out.println("equls > " + equals);
		
		
		boolean eq2 = str1.equalsIgnoreCase(str2);
		System.out.println("equls > " + eq2);
	}

	
}
