package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerDemo {
	
	public static void main(String[] args) {
		
		Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};
		
		//flowerArray[3] = new Rose("Rose"); //IndexOutOfBoundEx
		
		//1st difference: array have fixed size 
		
		//can we access them by index ?? Yes
		//can we access them using enhanced for loop? Yes
		
		
		ArrayList<Flower> flowerArrayList = new ArrayList<>();
		
		flowerArrayList.add(new Rose("Rose"));
		flowerArrayList.add(new Tulip("Tulip"));
		flowerArrayList.add(new Sunflower("Sunflower"));
		
		
		//can we access them by index ?? Yes
		//can we access them using enhanced for loop? Yes
		//can we access them using an iterator ? Yes
		
		//using for loop;
		//2 directions
		for (int i = 0; i < flowerArrayList.size(); i++) { //we can also go from last to first
			flowerArrayList.get(i).bloom();
		}
		
		
		//using enhanced for loop
		for (Flower f :flowerArrayList) {
			f.bloom();
		}
		
		//using interator 
		Iterator<Flower> it = flowerArrayList.iterator();		
		
		while (it.hasNext()) {
			it.next().bloom();
		}
		
	}

}
