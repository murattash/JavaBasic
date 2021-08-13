package com.neotech.lesson25;

public interface Shape {
	
	void calculateArea(double a);
	void calculatePerimeter(double a);
}

class Circle implements Shape {

	@Override
	public void calculateArea(double r) {
		double Area = 3.14 * r;
		
		System.out.println(Area);
		
	}

	@Override
	public void calculatePerimeter(double r) {
		
		double Perimeter = 2 * 3.14 * r; 
		System.out.println(Perimeter);
	}
	
}

class Square implements Shape {

	@Override
	public void calculateArea(double r) {
	
		double Area = r * r;
		System.out.println(Area);
	}

	@Override
	public void calculatePerimeter(double r) {

		double Perimeter = 4 * r; 
		System.out.println(Perimeter);
	}
	
}
