package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEchoCheckBoxAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://echoecho.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement milk = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/table[9]/tbody[1]/tr[1]/td[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/span[1]/form[1]/table[3]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"));
		driver.close();

	}

}
