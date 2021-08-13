package com.neotech.lesson16;

import java.util.Scanner; 

public class Homework1Test {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your fist name");
		String fName = scan.next();
		System.out.println("Please enter your last name");
		String lName = scan.next();
		System.out.println("Please enter your email type");
		String emailType = scan.next(); //method with no parameters because you are not putting anything in ()
		
		
		
		Homework1 hw = new Homework1 (); //object of the class that contains method 
		
		String fullEmail = hw.createEmail(fName, lName, emailType); // here we calling method and passing the arguments using scanner 
		
		System.out.println("The email is " + fullEmail);
		
		
	}

}
