package com.WebDriverDemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandelingMultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.citibank.co.in");
		
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
		System.out.println(driver.getTitle());
		
		Set<String>Windows = driver.getWindowHandles();
		System.out.println(Windows);
		
		Iterator<String>itr = Windows.iterator();
		String win1 = itr.next(); //opens first window
		String win2 = itr.next(); //opens second window
		
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("User_Id")).sendKeys("1234567");
		
		driver.switchTo().window(win1);
		driver.quit();

	}

}
