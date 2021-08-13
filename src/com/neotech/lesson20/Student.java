package com.neotech.lesson20;

public class Student {

	String studentName;
	int grade1;
	int grade2;
	int grade3;

	
	Student(String fName, int gotGrade1, int gotGrade2, int gotGrade3) {

		studentName = fName;
		grade1 = gotGrade1;
		grade2 = gotGrade2;
		grade3 = gotGrade3;

	}
	

	int getAverage() {

		return (grade1 + grade2 + grade3) / 3;
	}

}
