package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_after_Test {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
	}

	@AfterTest
	public void afterTest()
	{
		driver.close();
		System.out.println("After Test");
	}

	@Test(priority = 1)
	public void test1()
	{
		driver.get("https://www.meesho.com/");
		System.out.println("\tTitle : " +driver.getTitle());
	}

	@Test(priority = 2)
	public void test2()
	{
		driver.get("https://www.nykaa.com/");
		System.out.println("\tTitle : " +driver.getTitle());
	}
	@Test(priority = 3)
	public void test3()
	{
		driver.get("https://www.bewakoof.com/");
		System.out.println("\tTitle : " +driver.getTitle());
	}
	@Test(priority = 4)
	public void test4()
	{
		driver.get("https://www.myntra.com/");
		System.out.println("\tTitle : " +driver.getTitle());
	}
}
