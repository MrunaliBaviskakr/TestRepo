package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		String expTitle ="Google", actTitle;
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		actTitle = driver.getTitle();
		System.out.println("Title is :" +actTitle);
		System.out.println("Title matching!!! Test case pass");
		System.out.println("Title not matching!!! Test case fail");
		driver.close();

	}

}
