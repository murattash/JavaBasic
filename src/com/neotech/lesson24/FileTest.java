package com.neotech.lesson24;

public class FileTest {
	
	public static void main(String[] args) {
		
		//upcasting
		File javaFile = new JavaFile();
		
		
		//when we declare objects inside here, they are automatically upcasted
		File[] files = {new JavaFile(), new worldFile(), new PdfFile()};
		
		for (File f : files) {
			
			f.open();
			System.out.println("====================");
		}
		
		
		//can we downcast?
		//first loop: object of JavaFile --> can only downcast to JavaFile object
		//second loop: object of WorldFike --> "-   -"  WorFile object
		
		
		
		//another way
		File jFile = new JavaFile();
		File wFile = new worldFile();
		File pFile = new PdfFile();
		
		File[] files2 = {jFile, wFile, pFile};
	}

}
