package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * W.a. TestNG program to perform test with webdriver to login process of facebook
 */

public class TestngFBLogin {
	
	WebDriver driver;
	
	@BeforeClass
	public void before() throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
	@Test(priority = 0)
	public void username() throws InterruptedException
	{
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Swara@gmail.com");
	Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void password() throws InterruptedException {
	driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("123");
	Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException {
	driver.findElement(By.cssSelector("button[value='1']")).click();
	Thread.sleep(30000);
	}
	
	
	@AfterClass
	public void after() 
	{
		driver.close();	
	}
}
