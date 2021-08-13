package com.neotech.lesson22;

public class CalculateArea {
	
	static void area(int side) {
		System.out.println("The are of the square is: " + side * side);
	}

	static void area(int a, int b) {
		System.out.println("The area of Rectangle is: " + a * b);
	}
	
	static void area (int length, int width, int height) {
		System.out.println("The area of the Box is: " + length * width * height);
	}
}

