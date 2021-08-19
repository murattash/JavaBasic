package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/testdata/Test2.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook b = new XSSFWorkbook(fis);
		
		Sheet s = b.getSheet("TestData");
		
		//get the number of rows
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("rows -> " + rows);
		
		//get the numbers of columns/cells on the specific row
		int cols = s.getRow(0).getLastCellNum();
		System.out.println("cpls -> " + cols);
		
		System.out.println("---------------------------");
		//looping through all rows and columns
		
		for (int row = 0; row < rows; row++) {
			//iterating rows
			
			for (int col = 0; col < cols; col++) {
				//iterating columns
				String cellValue = s.getRow(row).getCell(col).toString();
				System.out.print(cellValue + " ");
			}
			
			System.out.println();
		}
		
		//This is not important for now! 
		b.close(); // this will release the memory 
		fis.close(); // this will realest the memory 
		
	}
	

}
