package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.reporters.jq.Main;
import org.apache.poi.ss.usermodel.CellType; 


public class Datadriven_Read {

	public static void read_All_Data() throws IOException  {
		
		System.out.println("All Data");
		
		File f = new File("C:\\Users\\Venkatesan\\SeleniumCourse\\Maven_Project\\User Details.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	//interface       class
	Workbook w =new XSSFWorkbook(fis);    //Upcasting
	
	Sheet sheetAt = w.getSheetAt(0);
	
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	
	//Outer Loop
	for(int i=0; i<numberOfRows; i++) {
		
		Row row = sheetAt.getRow(i);
		
		int numberOfCells =row.getPhysicalNumberOfCells();
		
		//Inner Loop
		for(int j=0; j< numberOfCells; j++) {
			
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(cellType.STRING)) {
				
				String value = cell.getStringCellValue();
				
				System.out.println(value);
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				
				double value = cell.getNumericCellValue();
				int num = (int) value;
				System.out.println(num);
			}
			
		}
	//	public static void main(String[]args) {
			
			read_All_Data();
		//	read_Particuar_Data();
		}
		
		
	}
	
	
	

	
	
	
	
	
	
	
	}
	

