package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1c {
	
	public static void main(String[] args) {
		
		//13. Create a Java program that will ask user to input city and temperature. 
				//Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		
		Scanner scanner = new Scanner (System.in);
		
		// Declare variables first 
		String city;
		int f; // temp in F
		int c; // temp in C
		
		System.out.println("Where are you from?");
		city = scanner.next();
		System.out.println("What is the temperature?");
		f = scanner.nextInt();
		
		// covert F into C
		
		c = (f-32)*5/9;
		System.out.println("The temperature in the city of " + city + " is " + c);
		
		
	}

}
