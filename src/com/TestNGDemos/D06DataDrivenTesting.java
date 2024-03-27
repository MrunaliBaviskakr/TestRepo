package com.TestNGDemos;

import org.testng.annotations.Test;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class D06DataDrivenTesting {
	WebDriver driver;
	
	String  expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	
	@Test(dataProvider = "getLoginData")
	public void f(String un, String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        actUrl = driver.getCurrentUrl();	
      //  Assert.assertTrue(actUrl.contains("dashboard"));
        Assert.assertEquals(expUrl, actUrl);
        //assert.assertTrue(actUrl.equals(expUrl));
	}
	@AfterMethod
	public void afterMethod() {
		if(actUrl.equals(expUrl))
		{
		driver.findElement(By.cssSelector("div[id=\"app\"]")).click();
		driver.findElement(By.partialLinkText("Log")).click();
		}
	}

	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "Kavya", "Kavya123" },
			new Object[] { "Mrunali", "Mrunali123" },
			new Object[] { "Manish", "Manish123" },

		};
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
