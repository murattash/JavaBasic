package com.neotech.lesson11;

public class ArrayLength {
	
	public static void main(String[] args) {
		
		String [] students = new String [6];
		
		students [0] = "Murat";
		students [1] = "Ozel";
		students [2] = "Sahin";
		students [3] = "Ivonee";
		
		System.out.println(students [1]);
		
		//how do we get the lenghth of the array
		
		int lengthOfStudentsArray = students.length;
		
		System.out.println("The lenghth of the array is " + lengthOfStudentsArray);
		
		//another way to declare arrays
		int[] scores = {50, 55, 89, 90, 87};
					  //0	1   2    3  4
		
		int lengthOfScores = scores.length;
		
		System.out.println("The length of the array is " + lengthOfScores);
		
		
	}

}
