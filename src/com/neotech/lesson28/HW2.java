package com.neotech.lesson28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numberColl = new ArrayList<>();
		
		for (int i = 0; i <= 4; i += 2 ) {
			
			numberColl.add(i);
		}
		
		System.out.println(numberColl);
		
		
		Iterator<Integer> it = numberColl.iterator(); // 3 methods -> next(); hasNext(); remove();
	
//		Integer element0 = it.next();
//		System.out.println(element0);
//		
//		Integer element1 = it.next();
//		System.out.println(element1);
//		
//		Integer element2 = it.next();
//		System.out.println(element2);
		
		
		
		while (it.hasNext()) { 	//if there is a next element, it is safe to get it 
			Integer number = it.next();
			System.out.println(number);
			
		}
		
	}


}
