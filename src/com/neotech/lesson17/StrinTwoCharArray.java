package com.neotech.lesson17;

public class StrinTwoCharArray {
	
	public static void main(String[] args) {
		//toCharArray()
		String str = "Today is Thursday and I have Java class";
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			System.out.println(c);
			
		}
		System.out.println();
		System.out.println("The length of the string is " + str.length()); //give me the length of the string
		System.out.println("The length of the char array is " + charArray.length);//give me the length of the char
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	
		
		
		
	}

}
