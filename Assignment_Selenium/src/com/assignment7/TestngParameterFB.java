package com.assignment7;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameterFB {

WebDriver driver;
	
	@BeforeClass
	public void before() throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	}
	
  @Test
  @Parameters({"email","password"})
  public void login(String email,String password) throws InterruptedException {
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(2000); 
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(2000);
	  driver.findElement(By.name("login")).click();
	  Thread.sleep(30000);
  }
  
  @AfterClass
  public void after() 
	{
		driver.close();	
	}
}
