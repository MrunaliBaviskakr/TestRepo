package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D15LocateByRelativeLocator {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
 driver.get("https://www.facebook.com/");
 
 driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("test123@gmail.com");
 driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("login"))).sendKeys("123456");
 driver.findElement(RelativeLocator.with(By.tagName("button")).below(By.name("pass"))).click();

	}

}
