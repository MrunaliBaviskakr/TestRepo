package com.WebDriverDemos;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D22Synchronization_FluentWait {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable--notification");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
	
		 driver.get("https://www.redbus.in/");
		 
		 //Source
		 driver.findElement(By.id("src")).sendKeys("Kolh");
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 wait.withTimeout(Duration.ofMillis(1))
		 .ignoring(NoSuchElementException.class)
		 .pollingEvery(Duration.ofMillis(1))
		 .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/div/div"))).click();
		 //driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/div/div")).click();
		 
		 //Target
		 driver.findElement(By.id("dest")).sendKeys("Bang");
		 driver.findElement(By.xpath("//input[@id='dest']")).click();
		 
		 //Calendar
		 driver.findElement(By.xpath("//div[@id='onwardCal']")).click();
		 //Date
		 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]")).click();
		 //Search Bus
		 driver.findElement(By.id("search_button")).click();
		 
		System.out.println(driver.findElement(By.xpath("//*[@id=\"result-section\"]/div[1]/div/div[2]/div/div[1]/div")).getText());
		driver.close();
		 
	}




}
