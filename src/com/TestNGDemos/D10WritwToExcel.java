package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.IOExceptionList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D10WritwToExcel {
	String fPath = "G:\\ExcelFiles\\MyFirstFile.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;

	@Test
	public void WriteToExcel() {
		row = sheet.createRow(0);  // creates 1st row index start from 0
		cell = row.createCell(0);  //creates 1st cell in 1st row
		cell.setCellValue("Mrunali");

		cell = row.createCell(1);  
		cell.setCellValue("Ravindra");
	}
	@BeforeTest
	public void beforeTest() throws FileNotFoundException
	{
		file = new File(fPath);
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sheet = wb.createSheet("Test Sheet");
	}

	@AfterTest
	public void afterTest() throws IOException{
		wb.write(fos);  //write data to workbook
		wb.close();
		fos.close();
	}

}
