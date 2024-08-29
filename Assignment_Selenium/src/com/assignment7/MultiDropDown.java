package com.assignment7;

import java.sql.Driver;

/*
 * W.A.J.Script for Selecting multiple items in a drop dropdown
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1=driver.findElement(By.id("cars"));
		Select s1=new Select(e1);
	
		s1.selectByIndex(0);
		Thread.sleep(2000);
		s1.selectByVisibleText("Audi");
		Thread.sleep(2000);
		s1.selectByValue("saab");
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	
	
}
