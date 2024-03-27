package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D23HandlingTable {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://money.rediff.com/gainers/bse/");
		
		//List<WebElement>headers = driver.findElements(By.tagName("th"));
		List<WebElement>headers = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("total rows are: " +rows.size());
		System.out.println(rows.get(9).getText());
		driver.close();
		

	}

}
