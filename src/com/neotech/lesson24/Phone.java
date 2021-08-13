package com.neotech.lesson24;

public abstract class Phone { //we need abstract before class to have abstract methods in this class 
	
	//implemented method
	public void call(){
		System.out.println("Phone can make calls");
	}

	public void text() {
		System.out.println("Phone can send texts!");
	}
	
	abstract void takePicture();
	
	
	abstract void playMusic();
	
}

class iPhone extends Phone {

	@Override
	void takePicture() {
		System.out.println("iPhones can take pictures!");
	}

	@Override
	void playMusic() {
		System.out.println("iPhones can play music");
	}
	
	public void call() {
		System.out.println("iPhone can make calls");
	}
	
}

class Samsung extends Phone {

	@Override
	void takePicture() {
		System.out.println("Samsung can take photos");
		
	}

	@Override
	void playMusic() {
		System.out.println("Samsung can play music");
		
	}
	
	
	void playGames() {
		System.out.println("Sumasung can play games");
	}
	
	
	
	
	
	
}