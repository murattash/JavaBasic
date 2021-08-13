package com.neotech.lesson03;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String language = "Java";
		
		//I love Java class!
		System.out.println("I love "+language+" class!");
		
		String s1 = "I love ";
		String s2 = " class!";
		System.out.println(s1+language+s2 );
		
		System.out.println("---------------------------");
		
		//spacing in strings
		System.out.println(     "Spacing!!");
		System.out.println("     Spacing!!");
		
		System.out.println("---------------------------");
		
		String s3 = "I have " + 2;
		String s4 = s3 + 4;  
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println("---------------------------");
		
		String two = "2";
		String four = "4";
		
		int t = 2;
		int f = 4;
		
		System.out.println("This is from summung Strings (two) and (four): " + two + four);
		System.out.println("This is from summing int (t) and (f): " + t + f);
		
		System.out.println("---------------------------");
		
		//Order of operations in a string
		
		//Order of reading    1        2   3      4
		System.out.println("I have " + 2 + 4 + " apples!");
		//I have + 2 (String + int >> String) >> "I have 2"
		
		//"I have 2" + 4 (String + int >> String) >> I have 24 ... apples!
		
		//order of reading     2         1          3
		System.out.println("I have "+ (2 + 4) + " apples!");
		
		
	}

}
