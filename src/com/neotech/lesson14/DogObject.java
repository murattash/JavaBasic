package com.neotech.lesson14;

public class DogObject {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog(); //we have created an instance of class Dog
		
		d1.Breed = "German Shepher";
		d1.Size = "Large";
		d1.Color = "Black/Gold";
		d1.Name = "Chak";
		d1.Age = 5;
		d1.Sleep = 3;
		
		d1.Eat();
		d1.Sleep();
		d1.Name();
		System.out.println();
		
		
		Dog d2 = new Dog();
		
		d2.Breed = "Bulldog";
		d2.Size = "Medium";
		d2.Color = "Yellow";
		d2.Name = "Bucky";
		d2.Age = 7;
		d2.Sleep = 7;
		
		
		d2.Run();
		d2.Name();
		d2.Sleep();
		System.out.println();
		
		
		
		Dog d3 = new Dog();
		
		d3.Breed = "Shiba uno";
		d3.Size = "Medium";
		d3.Color = "White";
		d3.Name = "Snowy";
		d3.Age = 8;
		d3.Sleep = 3;
		
		d3.Eat();
		d3.Sleep();
		d3.Name();
		
		
		
	}

}
