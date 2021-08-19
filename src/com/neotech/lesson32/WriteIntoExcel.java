package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/testdata/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("TestData");
		
		//I want to write into row with index 0
		sheet.getRow(0).createCell(5).setCellValue("Country");
		
		//I want to create a new row and write Shodmon in the first cell
		sheet.createRow(3).createCell(0).setCellValue("Shodmon");
		
		//I want to create a new sheet and name it Burak
		book.createSheet("Burak");
		
		//To write a file we need FileOutputStream
		FileOutputStream fos = new FileOutputStream(filePath);
		
		//Writing the content to the same file
		book.write(fos);
		
		
		
	}

}
