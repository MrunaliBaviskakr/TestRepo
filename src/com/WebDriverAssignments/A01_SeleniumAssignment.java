//Write a WebDriver script to navigate to a website and click on a specific link.

package com.WebDriverAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01_SeleniumAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		String currentURL = driver.getCurrentUrl();
		//driver.close();
	}

}
