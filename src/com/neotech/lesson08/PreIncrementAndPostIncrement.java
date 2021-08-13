package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {
	
	public static void main(String[] args) {
		
		//declare x 
		int x;
		//declare and initialize y
		int y = 10;
		
		
		//POST increment    - firstly use the variable, then increase it 
		x = y++; // x is equal to y, then increment y by 1
		
		System.out.println(x);
		System.out.println(y);

	
		//PRE increment -- firstly increase the variable value, then use it in the operation 
		int a;
		int b = 15;
		
		a = ++b; //b is increased to 16 and then assigned to a
		
		System.out.println(a);
		System.out.println(b);
		
		
		//PRE decrement > first decrease z to 4 and then assiging it to w
		
		int w;
		int z = 5;
		
		w = --z; // we are decrasiing z to 4 and then assign it to w
				
		System.out.println(w);
		System.out.println(z);

		
		//POST > prints c and then  decrease d to 6 and
		
		int c;
		int d = 7;
		
		c = d--; // we are assiging d to c and then we are reducing to 1
		
		System.out.println(c);
		System.out.println(d);
		
		
	}

}
