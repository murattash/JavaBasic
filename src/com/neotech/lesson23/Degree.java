package com.neotech.lesson23;

public class Degree {
	
	public static void main(String[] args) {

		Degree d = new Degree();
		d.getPrerequisite();
		
		Bachelors b = new Bachelors();
		b.getPrerequisite();
		
		Masters m = new Masters();
		m.getPrerequisite();
	}

	void getPrerequisite() {

		System.out.println("To get a degree you need high school diplomay");
	}
}

class Bachelors extends Degree {
	
}

class Masters extends Degree {

	void getPrerequisite() {
		System.out.println("To get a Masters degree you need high school and Bachelors diplomas");
	}


}
