package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D07LocateByID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test123");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}

}
