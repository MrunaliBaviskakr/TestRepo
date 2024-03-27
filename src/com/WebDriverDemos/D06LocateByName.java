package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.name("email"));
		//Read/Find the control whose name is "email" and store it in emailID project

		emailId.sendKeys("kuwar_mrunali@rediffmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("123456789");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();

	}

}
