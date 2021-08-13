package com.neotech.lesson07;

public class IntroToSwitch {
	
	public static void main(String[] args) {
		
		//given the number 1-7, print out the name of the day
		
		int day = 1;
		String dayName;
		
		//Using if conditions
		
		if (day==1) {
			
			System.out.println( "Monday");
			
		}else if (day == 2) {
			
			System.out.println( "Tuesday");
		} else if (day == 3) {
			
			System.out.println( "Wednesday");
		}else if (day == 4) {
			
			System.out.println( "Thursday");
		}else if (day == 5) {
			
			System.out.println( "Friday");
		}else if (day == 6) {
			
			System.out.println( "Saturday");
		}else if (day == 7) {
			
			System.out.println( "Sunday");
		}else {
			
			System.out.println("That is not a day");
		}
			
		
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("");
			
		
		//Using Switch case 
		
		
		switch (day) 
		{
		case 1: 
			System.out.println("Monday");
			dayName = "Monday";
		break; // ends the execution of the block and will continue to execute
		
		case 2:
			System.out.println("Tuesday");
			dayName = "Tuesday";
		break;
		
		case 3:
			System.out.println("Wednesday");
			dayName = "Wednesday";
		break;
		
		case 4: 
			System.out.println("Thursday");
			dayName = "Thursday";
		break;
		
		case 5: 
			System.out.println("Friday");
			dayName = "Friday";
		break;
		
		case 6:
			System.out.println("Saturday");
			dayName = "Saturday";
		break;
		
		case 7:
			System.out.println("Sunday");
			dayName = "Sunday";
		break;
		
		default: //same as else block
			System.out.println("This is not a day");
			dayName = "Invalid";
		break;
		
		
		}
		
		System.out.println("The name of the day with number " + day +" is " + dayName);
		
		
	}

}
