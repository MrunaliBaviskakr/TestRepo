package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropdownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);

		System.out.println("Selected country is : " +countries.getFirstSelectedOption().getText());
		List<WebElement>countryList = countries.getOptions();
		System.out.println("Total countries : " +countryList.size());

		/* int i=0;
        for(WebElement c : countryList)
        {
        	System.out.println(i+ "." +c.getText());
        	i++;
        }
		 */
		// countries.selectByVisibleText("Canada");
		//  countries.selectByValue("37");
		countries.selectByIndex(35);

		System.out.println("Selected country is " +countries.getFirstSelectedOption());
		driver.close();
		
		new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]"))).selectByIndex(8);//select date 8

	}

}
