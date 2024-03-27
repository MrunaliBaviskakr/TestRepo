package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo02AbsoluteXPath {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("kuwar_mrunali@rediffmail.com");
	 driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("123456");
	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
	 
	}

}