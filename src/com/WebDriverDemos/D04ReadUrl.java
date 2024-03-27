package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D04ReadUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		String url = driver.getCurrentUrl();
		System.out.println("URL : " +url);

		driver.close();
		;
	}

}
