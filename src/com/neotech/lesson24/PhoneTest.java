package com.neotech.lesson24;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		//Phone ph = new Phone();
		//CE: we cannot create an object of the abstract class 
		
		//we can indirectly create objects of abstract class by
		//using upcasting
		Phone iphone = new iPhone(); 
		
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		Phone samsung = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		
		//downcasting 
		Samsung sm = (Samsung) samsung;
		sm.playGames();
		
		
	}

}
