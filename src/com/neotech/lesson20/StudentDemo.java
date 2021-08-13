package com.neotech.lesson20;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		//creating objects using the constructor with parameters
		Student st = new Student("Marcus", 75, 50, 100);
		//for each object i am printing the name and the average 
		System.out.println("Student " + st.studentName + " has an average of " + st.getAverage());
		
		
		Student st2 = new Student("Alex", 95, 98, 87);
		System.out.println("Student " + st2.studentName + " has an average of " + st.getAverage());

		
		
		Student st3 = new Student("Sean", 80, 89, 100);
		System.out.println("Student " + st3.studentName + " has an average of " + st.getAverage());

		
		
		
	}

}
