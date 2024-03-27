package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByPartialLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");

		//WebElement adLink = driver.findElement(By.partialLinkText("Ad")); link to check adverise on google page by ising char Ad
		
		WebElement adLink = driver.findElement(By.partialLinkText("ert"));
		// link to check advertise on google page by ising char ert. (advertise so took char ert only)
		adLink.click();
		
		

	}

}
