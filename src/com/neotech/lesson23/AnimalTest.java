package com.neotech.lesson23;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		//			holds instance of the tiger class
		//obj jumps inside the Tiger class and checks for the methods
		//and if it is overwritten it will take it and print it
		
		Animal obj = new Tiger();
		obj.eat();
		obj.sleep();
	//	obj.run(); //run() is not defined in the Animal access
		
		System.out.println("");
		
		Animal obj2 = new Animal();
		obj2.eat();
		obj.sleep();
		
		System.out.println("");
		
		Tiger obj3 = new Tiger();
		obj3.eat();
		obj3.sleep();
		obj3.run();
		
	}

}
