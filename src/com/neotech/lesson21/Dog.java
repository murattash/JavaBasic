package com.neotech.lesson21;

public class Dog extends Animal {
	//single inheritance since we are using two classes 

		
	//specific feature of the dog
	
	String breed;
	
	//specific behavior of the dog
	
	public void bark() {
		System.out.println("The dog barks");
	}
	
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();
	}

}
