package com.neotech.lesson25;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape so = new Circle();
		so.calculateArea(2);
		so.calculatePerimeter(25);
		
		Shape so2 = new Square(); 
		so2.calculateArea(40);
		so2.calculatePerimeter(19);
	}

}
