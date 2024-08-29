package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. script To write the script for image of logo facebook using xpath.
 */

public class FBLogo {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
//	WebDriver driver=new EdgeDriver();
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/help/contact/1012555656");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div[1]/div/div[1]/h1/a/i")).click();
	Thread.sleep(2000);
	
	driver.close();
}
}
