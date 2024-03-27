package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D09POMClient {
	WebDriver driver;
	PracticeTestLogin P1;

	@Test
	public void login() {

		P1.addUserName("student");
		P1.addPassword("Password123");
		P1.clickOnlogin();
		P1.showMsg();
	}

	@AfterMethod
	public void logout() {
		P1.logout();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");

		P1 = new PracticeTestLogin(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
