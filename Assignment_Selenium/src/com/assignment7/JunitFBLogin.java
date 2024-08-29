package com.assignment7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.a. junit program to perform test with webdriver to login process of facebook
 */

public class JunitFBLogin {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void before() throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test
	public void test() throws InterruptedException
	{
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Swara@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[value='1']")).click();
	Thread.sleep(30000);
	}
	
	@AfterClass
	public static void after() 
	{
		driver.close();	
	}
	
}
