package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A04_RegistrationForm1 {

	public static void main(String[] args) throws InterruptedException {

				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://demoqa.com/automation-practice-form");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,700)");
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mrunali");
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kuwar");
				driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("admin123@gmail.com");
				driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
				driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1122345672");
				driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
			 driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, March 2nd, 2005']")).click();
				js.executeScript("window.scrollBy(0,500)");
				
				driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
			//	driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\chava\\Downloads\\demo-data (1).xlsx");
			driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Wagholi , Pune");
			driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
			}
			
		}

	