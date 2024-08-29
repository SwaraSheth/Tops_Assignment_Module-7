package com.assignment7;

/*
 * W.A.J.Script for Selecting multiple items in a drop dropdown
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingLinks {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	driver.get("https://phptravels.com/demo/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Product")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Tech")).click();
	Thread.sleep(2000);
	
	driver.close();
	
}
}
