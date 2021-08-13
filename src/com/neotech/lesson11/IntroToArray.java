package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data type			//identifier		assigment operator		   value
		int 					num					=						10;			
	
		//2nd way
		//declare
		int num1;
		
		//initialize 
		num1 = 10;
		
		
		//declare array
		int[] array;
		
		//Initialization
		array = new int [5];
		
		
		
		
		
		
		//2nd way
		int [] array2 = new int [5];	
		
		
		array [0] = 10;
		//[10] [] [] [] [] 
		
		array[2] = 30;
		//[10] [] [30] [] [] 
		
		
		array [1] = 20;
		//[10] [1] [30] [] [] 
		
		
		array [3] = 40;
		//[10] [1] [30] [40] [] 
		
		
		array [4] = 50;
		//[10] [1] [30] [40] [4] 
		
		//access the element
		System.out.println(array[4]);
		
		
		
		String [] strArray = new String [4];
		
		strArray [0] = "New York";
		//[ "New York ,      ,      ,        ]
		strArray [1] = "New Jersey";
		//[ "New York, New Jersey,      ,        ]
		strArray [3] = "Pennsilvania";
		//[ "New York, New Jersey,          , Pennsylvania       ]
		strArray [2] = "Connecticute";		
		//[ "New York, New Jersey, Connecticute, Pennsylvania       ]
		
		
		System.out.println("I live in" + strArray[1]);
				
		//strArray [5] = "California"; every index out of [0 to 3] will give error because size is 4
		
		
		
		char [] letters = new char [6];
		
		letters[0] = 'B';
		letters[5] = 'A';
		letters[4] = 'C';
		letters[1] = 'X';
		letters[3] = 'Y';
		
		System.out.println("Letter at index 4 is " + letters [4]);
		
		letters[4] = 'D';
		
		System.out.println("Letter at index 4 is " + letters [4]);
		
		
	}
	

}
