package com.neotech.lesson18;

public class CatDemo {
	
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		
		cat1.name = "Lucy";
		cat1.color = "White";
		cat1.age = 2;
		
		cat1.sayMeow();
		
		
		Cat cat2 = new Cat();
		
		cat2.name = "Felicia";
		cat2.color = "Brown";
		cat2.age = 3;
		
		cat1.displayCatInfo();
		cat2.displayCatInfo();
		
		//we want to name Lucy to Tekir
		
		cat1.name = "Tekir"; //it will print the new name after it prints the original
		
		cat1.displayCatInfo();
		
		System.out.println();
	}
	
	

	
}
