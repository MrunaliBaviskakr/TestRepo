package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {

	@Test (priority = 2)
	public void openMyntra()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		driver.getTitle();
		//System.out.println("Title : " + title.getTitle());
		driver.close();
	}

	@Test (priority = 4)
	public void openBewkoof()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bewakoof.com/");
		driver.getTitle();
		driver.close();
	}

	@Test (priority = 1)
	public void openNykaa()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.nykaa.com/");
		driver.getTitle();
		//System.out.println("Title : " + title.getTitle());
		driver.close();
	}

	@Test(priority = 3)
	public void openMeesho()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.meesho.com/");
		driver.getTitle();
		driver.close();
	}
}
