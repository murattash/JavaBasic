package com.neotech.lesson25;

public class DoctorTest {
	
	public static void main(String[] args) {
		
		Doctor doctor = new Doctor();
		
		doctor.setEmail("");
		System.out.println(doctor.getEmail());
		
		doctor.setEmail("hakan@yahoo.com");
		System.out.println(doctor.getEmail());
		
		doctor.setEmail("ozel@gmail.com");
		System.out.println(doctor.getEmail());
	}


}
