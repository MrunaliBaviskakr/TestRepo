package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12ReadTheData {
	String fPath = "\\G:\\ExcelFiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
  @Test
  public void readData() {
	  row = sheet.getRow(0);  //Read the 1st row
	  cell = row.getCell(0);   //read the 1st cell of the 1st row
	  
	  //String data = cell.getStringCellValue();
	  //System.out.println(data);
	  
	  System.out.println(cell.getStringCellValue());
  }
  @BeforeTest
	  public void beforeTest() throws IOException {
			file = new File(fPath);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
sheet = wb.getSheet("Login Data");

  }

  @AfterTest
  public void afterTest() throws IOException
  {
		wb.close();
		fis.close();
  }

}
