package com.neotech.lesson25;

public class Doctor {
	
	private String licenseID;
	private long phoneNr;
	private String email;
	
	
	
	public long getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(long phoneNr) {
		//you can add a logic to check if the number has 10 digits
		this.phoneNr = phoneNr;
	}
	
	//the getter method for email
	public String getEmail() {
		return email;
	}
	
	//the setter method for Email
	public void setEmail(String email) {
		// we have some conditions
		if (!email.isEmpty()) {
			if (email.contains("gmail")) {
				this.email = email;
			} else {

				System.out.println("You have to use Gmail");
			}
		} else {
			System.out.println("The email cannot be empty");
		}

	}
	
	
	
	
	
}
