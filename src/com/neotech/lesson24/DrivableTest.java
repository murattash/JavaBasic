package com.neotech.lesson24;

public class DrivableTest {
	
	public static void main(String[] args) {

		Vehicle v = new Cars();
		
		v.start();
		v.stop();
		
		
		Drivable dr = new Cars();
		dr.drive();//runs the implemented method in Car
		System.out.println(Drivable.move_fast);
		
		
		
	}

	

}
