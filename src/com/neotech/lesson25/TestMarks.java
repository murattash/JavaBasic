package com.neotech.lesson25;

public class TestMarks {
	
	public static void main(String[] args) {
		
		Marks mo = new StudentA (65, 87, 98);
		
		Marks mo2 = new StudnetB(80, 92, 88, 94);
		
		System.out.println (mo.getAverage());
		System.out.println (mo2.getAverage());		
	}

}
