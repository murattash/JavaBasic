package com.neotech.lesson18;

public class Dog {
	
	//instance/object variables

	String name;
	int age;
	
	//static class variable
	static String breed = "Husky";
	static int paws = 4;
	
	void displayDogInfo()
	{
		System.out.println("Name: " + name + ", Age: " + age + ", Breed: " + breed + ", Paws " + paws);
	}
}


