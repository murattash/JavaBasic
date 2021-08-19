package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework1 {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = System.getProperty("user.dir") + "/testdata/Homework.xlsx";
			//see where the filePathtakes you
		//System.out.println(filePath);
		
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Companies");
		
		
		ArrayList<String> al = new ArrayList<>();
		
		Row r = sheet.getRow(2);
		int cols = r.getLastCellNum();
		
		
		for(int c = 0; c < cols; c++) {
			//Step by step way
			//String str = r.getCell(c).toString();
			//al.add(str);
			
			//one liner
			al.add(r.getCell(c).toString());
			
		}
		
		System.out.println(al);
		
		System.out.println("---------");
		
		Set<Double> set = new HashSet<>();
		
		int r2 = sheet.getPhysicalNumberOfRows();
		
		for (int i = 1; i < r2; i++) {
			
			set.add(sheet.getRow(i).getCell(4).getNumericCellValue());
		}
		
		System.out.println(set);
		
		
	}

}
