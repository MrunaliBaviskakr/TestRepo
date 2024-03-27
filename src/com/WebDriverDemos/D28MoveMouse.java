package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D28MoveMouse {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.istqb.in/");

		Actions act = new Actions(driver);
		Alert alt;
		//WebElement spMenu = driver.findElement(By.linkText("SPECIALIST"));
		//act.moveToElement(spMenu).perform();
		act.moveToElement(driver.findElement(By.linkText("SPECIALIST"))).perform();

		}

}
