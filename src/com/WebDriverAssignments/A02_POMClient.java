//2. Implement a Page Object Model for a login page using WebDriver.

package com.WebDriverAssignments;

import org.testng.annotations.Test;
import com.TestNGDemos.PracticeTestLogin;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A02_POMClient {
	WebDriver driver;
	PracticeTestLogin P1;
  @Test
  public void beforeMethod() {
	  P1= new PracticeTestLogin(driver);
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
  public void BeforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  
  }

  @AfterTest
  public void afterTest() {
  driver.close();
  }

}

