package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocateByCssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.cssSelector("input[type=\"text\"]"));
		emailId.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[id=\"pass\"]"));
		password.sendKeys("123456");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[value=\"1\"]"));
		loginBtn.click();


	}

}
