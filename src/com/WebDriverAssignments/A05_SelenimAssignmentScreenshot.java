//
//5. Write a WebDriver script to capture a screenshot of a webpage and save it to a specific location

package com.WebDriverAssignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A05_SelenimAssignmentScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		{
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			//Thread.sleep(1000);

			TakesScreenshot ss = (TakesScreenshot)driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			File Folder = new File("G://MrunaliSeleniumDemos//JavaAutomationProject//Screenshot//img.png");
			FileUtils.copyFile(source,Folder);

//			driver.close();

		}
	}
}

