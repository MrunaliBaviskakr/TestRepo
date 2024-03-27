package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXPath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("kuwar_mrunali@rediffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("Ganesh@6621");
		//driver.findElement(By.xpath("//div[@id=\"passContainer\"]/input")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();
	}

}
