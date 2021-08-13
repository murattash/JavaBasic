package com.neotech.lesson25;

public abstract class Marks {
	
//	We have to calculate the average of marks obtained in three subjects by student A and by student B. 
//	Create a class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks. 
//	Provide implementation of the abstract method in classes 'StudentA' and 'StudentB'. 
//	The constructor of StudentA takes the marks of three subjects as parameters and the constructor of StudentB takes marks of four subjects as parameters. 
//	Test your code.

	public abstract double getAverage();	
}

class StudentA extends Marks {
	
	double a, b, c;
		
	StudentA (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getAverage() {		
		return (a + b + c) / 3;
	}	
}

class StudnetB extends Marks {
	
	double a, b, c, d;
	
	StudnetB (double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	
	public double getAverage() {
		
		return (a + b + c + d) / 4;
	}
	
}