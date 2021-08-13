package com.neotech.lesson21;

public class Barn {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.age = 5;
		a.color = "Black";
		a.size = "Big";
		
		a.eat();
		a.sleep();
		a.info();
		
		//a.breed = " ";
		//a.bark();
		
		
		System.out.println("----------------");
		
		
		Dog d = new Dog();
		
		d.age = 3;
		d.color = "Gray";
		d.size = "Medium";
		//dog has extra feature of its own
		
		d.eat();
		d.sleep();
		d.info();
		
		Puppy p = new Puppy();
		
		p.age = 1;
		p.color = "White";
		p.size = "Medium";
		//Feature coming from the dog class 
		p.breed = "Buldog";
		
		
		Cat c = new Cat();
		
		c.age = 4;
		c.color = "white";
		c.size = "Medium";
		
	}

}
