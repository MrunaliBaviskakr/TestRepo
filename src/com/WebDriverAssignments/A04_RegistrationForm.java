
package com.WebDriverAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A04_RegistrationForm {

	public static void main(String[] args) throws InterruptedException {

		WebElement month,year,subject = null,pic,state,city,date;
		Select s;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");

		//Enter first name
		driver.findElement(By.id("firstName")).sendKeys("Mrunali");

		//Enter last name
		driver.findElement(By.id("lastName")).sendKeys("Kuwar");

		//Enter email
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("admin@123");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", "");

		//Enter Gender
		WebElement Female = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		if(!Female.isSelected())
		{
			Female.click();
		}

		//Enter mobile no
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("112234567");

		//Enter DOB
		driver.findElement(By.cssSelector("input[id=\"dateOfBirthInput\"]")).click();
		year = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		s=new Select(year);
		s.selectByVisibleText("2003");
		month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		s=new Select(month);
		s.selectByVisibleText("May");
		//date
		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[3]")).click();

		js.executeScript("window.scrollBy(0,450)", "");

		//Enter Subject
		subject = driver.findElement(By.id("subjectsInput"));
		subject.click();

		subject.sendKeys("E");
		driver.findElement(By.xpath("//div[text()='English']")).click();
		subject.sendKeys("M");
		driver.findElement(By.xpath("//div[contains(text(),'Maths')]")).click();
		subject.sendKeys("H");
		driver.findElement(By.xpath("//div[contains(text(),'Hindi')]")).click();

		//Enter hobbies
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();

		//Enter hobbies
		js.executeScript("arguments[0].click()",driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[2]/input")));

		//Enter picture
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\admin\\Downloads\\userclass_report1706613831.xlsx");

		//Enter address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Ivy Aprtmeny,Ivy Estate, Wagholi,Pune");

		//Enter State
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[2]/div/div[2]/div/div[1]")).click();

		//Enter City
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[3]/div/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[10]/div[3]/div/div[2]/div/div[1]")).click();
		//Enter submit button
		driver.findElement(By.id("submit")).click();

		//driver.close();
	}

}
