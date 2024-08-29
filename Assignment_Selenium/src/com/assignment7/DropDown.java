package com.assignment7;

/*
 * 
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement e1=driver.findElement(By.name("country"));
	Select s1=new Select(e1);
	
	s1.selectByIndex(10);
	Thread.sleep(2000);
	s1.selectByValue("BHUTAN");
	Thread.sleep(2000);
	s1.selectByVisibleText("INDIA");
	Thread.sleep(2000);
	
	driver.close();
}
}

