package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngGmailLogin {

WebDriver driver;

@Test
public void before() throws InterruptedException{
//	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
//	driver=new EdgeDriver();
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();

	driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fwww.google.com%2F%3Fptid%3D19027681%26ptt%3D8%26fpts%3D0&ec=futura_hpp_co_si_001_p&ifkv=Ab5oB3qXk_yGaH5YdjKrQhk5zPz4ZTdejegOyZRZ1M-4Gvmbv5aYdC0xHwaJcmEr_3TbVUWBAfCzig&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S671756960%3A1724241729733822&ddm=0");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}

@Test(dependsOnMethods = "before")
public void username() throws InterruptedException {
	driver.findElement(By.id("identifierId")).sendKeys("swarasheth09@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	Thread.sleep(2000);
}

@Test(dependsOnMethods = "username")
public void password() throws InterruptedException{
	driver.findElement(By.name("Passwd")).sendKeys("Pass@1234");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
	Thread.sleep(2000);
	}

@Test(dependsOnMethods = "password")
public void after() {
	driver.close();
}
}
