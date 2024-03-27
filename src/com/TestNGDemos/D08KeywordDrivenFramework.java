package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D08KeywordDrivenFramework {
	WebDriver driver;
	String fPath = "G:\\MrunaliSeleniumDemos\\JavaAutomationProject\\src\\com\\TestNGDemos\\MyData.Properties";
			File file;
	FileInputStream fis;
	Properties prop;

	@Test
	public void login() {
		driver.findElement(By.xpath(prop.getProperty("unTextBoxXpath"))).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.id(prop.getProperty("passTextBoxName"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("logBtnXpath"))).click();

	}
	@AfterMethod
	public void afterMethod() {
		System.out.println(driver.findElement(By.id(prop.getProperty("errMsgId"))).getText());

	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis); //prop all the properties in prop object
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--Headless");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get(prop.getProperty("url"));
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}