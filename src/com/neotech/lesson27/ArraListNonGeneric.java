package com.neotech.lesson27;

import java.util.ArrayList;

public class ArraListNonGeneric {

	
	public static void main(String[] args) {
		
	
		
		//generic arayList
		
		ArrayList<Double> al = new 	ArrayList<>();
		
		al.add(10.99);
		al.add(21.2);
		al.add(15.5);
		
		
		//al.add(50); java shows a CE, because you said everything in this collection will be a Double
		//al.add("Hello"); 
		
		System.out.println(al);
		
		//		al.add(new Double(50));  != al.add(50) // deprecated -- probably will be dropped by future versions of java
		//		50.0  of type double to 50.0 of type Double, not from Integer 50 --- to Double 50.0
		
		al.set(1, 12.5); //if index (in this case 1), is large than the size of the arrayList 
		
		//remove an item from al
		al.remove(2);
		
		System.out.println(al);
		
		//get an element at index 0
		System.out.println("Element at index 0 is : " + al.get(0));
		
		//how do we access all elements in generic arrayList
		
		for (int i = 0; i < al.size(); i++) {	
				System.out.println(al.get(i) + " ");	
		}
		
		System.out.println();
		
		for (Double d : al) {
			System.out.println(d + " ");
		}
		
		
		System.out.println("===========================================");
		
		
		//non generic arrayList
		ArrayList al2 = new ArrayList();
		
		al2.add(100);
		al2.add("Hello");
		al2.add(22.5);
		al2.add(al);
		
		System.out.println(al2);
		
		
		for (Object obj : al2) {
			System.out.print(obj + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
