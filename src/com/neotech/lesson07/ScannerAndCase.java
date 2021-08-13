package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndCase {
	
	public static void main(String[] args) {
		
		//ask user to enter their country 
		//once value are captured print which language user speak
		
		Scanner scan = new Scanner (System.in);
		
		String country;
		
		System.out.println("What is your country Albania, USA, or Turkiey?");
		country = scan.next();
		
		if (country.equals("Albania")) // checking if country == "Albania" --> this is for STRINGS
			
		{ System.out.println("You speak Albanian"); }
		
		
		else if (country.equals("USA"))
		
		{ System.out.println("You speak English");}

		
		else if (country.equals("Turkiey")) 
		
		{ System.out.println("You speak Turkish");} 
		
		
		else {System.out.println("I dont know what language you speak!");}
		
		
	}

}
