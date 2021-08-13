package com.neotech.lesson29;

import java.util.*;

public class Task1 {
	
//	Create a map of a building. 
//	Store floor number and it is associated company name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). 
//	Insert 7 entries with duplicate keys and values.
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> floorCompany = new HashMap<>();
		
		floorCompany.put(1, "HP");
		floorCompany.put(2, "ATT");
		floorCompany.put(3, "Verizon");
		floorCompany.put(4, "Google");
		floorCompany.put(5, "Apple");
		floorCompany.put(6, "ATT");
		floorCompany.put(7, "Verizon");
		
		System.out.println("There are " + floorCompany.size() + " companies in this building");
		
		floorCompany.replace(4, "Bluemont");
		System.out.println(floorCompany);
		
		floorCompany.remove(7);
		floorCompany.put(7, null);
		System.out.println(floorCompany);
		
		
	
	}

}
