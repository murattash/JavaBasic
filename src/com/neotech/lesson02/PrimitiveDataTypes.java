package com.neotech.lesson02;

public class PrimitiveDataTypes {
	
	public static void main (String [] args) {	
		//There are 8 primitive data types in Java
		//to store whole numbers --> byte, short, int, long 
		
		byte var1 = -15; //the range is -128 to 127, total of 256 different values
		
		//compiler will give an error
		//byte var2 = 130
		
		short varShort = 130; //the rage is -32768 to 32767
		
		//complier-error, because I cannot store a decimal into a short 
		//short varShort2 = 3.5
		
		//complier-erro, because I have already used var1 as an identifier
		//int var1 = 76456
		
		int var3 = 76456; //the range is more than -2 billions up to more than 2 billion
		int var4 = 15; // I can store a small number in a big container 
		
		//if the number is greater than 2 billion then I you have to put L or l at the end 
		long number = 872680989099l;
		
		//to store decimal numbers --> float or double
		float number2 = 3.55436347654456f; // you must use F or f at the end

		double number3 = 234.31241523423; //when you use double you don't need F at the end
		
		System.out.println(number2);
		System.out.println(number3);
		
		//to store one single character ---> char
		
		char var5 = 'k';
		char var6 = 'K';
		char var7 = '$';
		char var8 = ' '; //this is a space character
		char var9 = '9';	
	
		System.out.println(var7);
		
		//to store boolean values (true/false)
		boolean b = true;
		
		// I cannot use public as a variable name, because it is a special word.
		//int public = 5
		
	}

}
