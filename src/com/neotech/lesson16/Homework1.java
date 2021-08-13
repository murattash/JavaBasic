package com.neotech.lesson16;

public class Homework1 {
	
	public static void main (String[] args) {
		
		Homework1 hw = new Homework1 ();
		String fullEmail = hw.createEmail("Shodmon", "Baba", "yahoo");
		System.out.println("The email is " + fullEmail);
		
	}
	
	
	String createEmail (String firstName, String lastName, String emailType) {
		String email = firstName + lastName + "@" + emailType + ".com";
		return email;
	
	}  

	
	
}
