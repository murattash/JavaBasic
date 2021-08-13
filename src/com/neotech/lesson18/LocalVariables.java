package com.neotech.lesson18;

public class LocalVariables {
	
	public static void main(String[] args) {
		
		LocalVariables obj = new LocalVariables();
		obj.method1();
		
		
		boolean flag = true; //scope of this variable is the main() method 
		
		if (flag) {
			
			String answer = "yes"; //the scope of this variable is only the if condition
			System.out.println(answer);
			System.out.println(flag);
		}
		
		System.out.println(flag);
		
	}
	
	
	
	
	
	void method1() { //they only reside in this method. They are visible within their scope.
		
		String name = "Sabah";
		int age = 30;
		
		System.out.println(name);
	}
	
	
	void method2() {
		
		String name = "Komron";
		//Compilation error, It doesn't know what age is.
		//System.out.println(age);
		
	}

}
