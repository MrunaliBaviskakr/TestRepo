package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchoTrakAssignments {

	public static void main(String[] args) {
		String expMsg = "Invalid UserName/Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");

		//WebElement userName = driver.findElement(By.id("txtCustomerID"));
		//userName.sendKeys("Mrunali");
		 driver.findElement(By.id("txtCustomerID")).sendKeys("Mrunali");
		 
		//WebElement password = driver.findElement(By.name("txtPassword"));
		//password.sendKeys("mrunali");
		driver.findElement(By.name("txtPassword")).sendKeys("mrunali");
		
		//WebElement loginBtn = driver.findElement(By.id("Butsub"));
		//loginBtn.click();
         driver.findElement(By.id("Butsub")).click();
         
		//WebElement errMsg = driver.findElement(By.className("align"));
		//String msg = errMsg.getText();
		String msg = (driver.findElement(By.cssSelector("span[class=\"error\"]")).getText());
		
		System.out.println("Error message is:" +msg);

		if(msg.equals(expMsg))
			System.out.println("Correct Msg\nTest case pass");
		else
			System.out.println("Wrong msg\nTest case is fail");
		driver.close();


	}

}
