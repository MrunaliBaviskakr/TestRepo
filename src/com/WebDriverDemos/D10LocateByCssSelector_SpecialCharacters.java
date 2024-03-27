package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector_SpecialCharacters {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//* =>
		WebElement emailId = driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]"));
		emailId.sendKeys("test@gmail.com");
		//$ => Ends with
		WebElement password = driver.findElement(By.cssSelector("input[placeholder$ = \"word\"]"));
		password.sendKeys("1234567");
		//^=> Starts with
		WebElement loginBtn = driver.findElement(By.cssSelector("title[id=\"pageTitle\"]"));
		loginBtn.click();
	}

}
