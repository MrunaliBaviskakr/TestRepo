//3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.

package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A03_DropdrownList {

	public static void main(String [] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");

		WebElement drpList = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select colour = new Select(drpList);
		System.out.println("Selected colour is : " +colour.getFirstSelectedOption().getText());

		//colour.selectByIndex(4);
		//colour.getFirstSelectedOption();
		//Select colour = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		colour.selectByVisibleText("Purple");
		//driver.close();
	}



}


