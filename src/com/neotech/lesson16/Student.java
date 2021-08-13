package com.neotech.lesson16;

public class Student {
	
	public static void main(String[] args) {
		
		Student st =  new Student ();
		
		char result = st.getGrade(92);
		
		System.out.println("The student got a " + result);
		
	}
	
	char getGrade(int score) { //score is the parameter, char is the return type
		
		char grade;
		
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		
		return grade;
		
	}

}
