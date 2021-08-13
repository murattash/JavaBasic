package com.neotech.lesson14;

public class Dog {
	
	//features
	String Breed, Size, Color, Name;
	int Age;
	int Sleep;
	
	//behaviors 
	void Eat()
	{
		System.out.println(Breed + " is eating");

	}
	
	
	void Sleep()
	{
		System.out.println(Breed + " sleeping time is " + Sleep);
	}
	
	void Run()
	{
		System.out.println(Breed + " is running");
	}
	
	
	void Name()
	{
		System.out.println("Dog name: " + Name);	
	}
	
}

