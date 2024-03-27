package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandelingDynamicMenus {

	public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  driver.get("https://www.istqb.in/");
	  
	  List<WebElement>menus = driver.findElements(By.xpath("/html/body/div[1]/div/header/div/div/div/div[2]/div/nav/ul/li"));
	  
	  for(WebElement m : menus)
		  System.out.println(m.getText());
	  
	  driver.close();
	}

}
