package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "/Users/mtashpulatov/Documents/Test.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		//read the workbook (the whole excel file)
		Workbook book = new XSSFWorkbook(fis);
		
		//Accessing the sheet that I want to read 
		Sheet sheet = book.getSheet("Sheet1");
		
		//Accessing the row that I want to read 
		Row row = sheet.getRow(0);
		
		//Accessing the cell that I want to read 
		Cell cell = row.getCell(1);
		
		//Getting data/information from the cell 
		String info = cell.toString();
		System.out.println(info);
		
		//How do I get NY
		Row row2 = sheet.getRow(2);
		Cell cell3 = row2.getCell(3);
		String cellValue = cell3.toString();
		System.out.println(cellValue);
		
		
		//How to get Garfield, with method chaining 
		String cellInfro = sheet.getRow(1).getCell(2).toString();
		System.out.println(cellInfro);
		
		//How to get numeric value from the cell 
		//You can use this method only for numbers that are in a cell 
		double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellDoubleValue);
		
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		
		//I can get the zip ad a String
		//You need to have a String inside the cell to use .getStringCellValue
		String zip = sheet.getRow(1).getCell(4).toString();
		System.out.println(zip);
		
		
		
		
		
		
		
		
		
	}

}
