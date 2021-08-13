package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {
	
	public static void main(String[] args) {
		
		
		// cmd + shift + o > shortcut 
		Scanner scan = new Scanner (System.in);
		
		//String text1, text2, text3;
		//int age, year;
		//double salary;
		//boolean isRaining;
		//char gender;
		
		
		//System.out.println("Input a line of text: "); //today is cloudy!!!
		///text1 = scan.nextLine(); // from the start of the sentence to the first space encountered 
		//System.out.println(text1);
		//text2 = scan.next();
		//System.out.println(text2);
		//text3 = scan.next(); // from the point you are starting get everything until the end of line
		//System.out.println(text3);
		
		//next () vs. nextLine()
		
		char gender;
		
		
		System.out.println("What is you gender (M OR F): ");
		
		//identifier | assignment operator| scan |next() gets input from the start until the first space| charAT
		
		//gender = scan.next().charAt(0); // the number in charAt is counting letters it is instead of 
		
		//line 37 is equvalent to these two lines below
		//text1 = scan.next();
		String text1 = scan.next();
		
		System.out.println(text1);
		
	}

}
