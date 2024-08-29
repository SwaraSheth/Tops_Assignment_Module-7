package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * W.A.J.script to register your self in Gmail.
 */

public class GmailRegistration {
public static void main(String[] args) throws InterruptedException {
//	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
//	WebDriver driver=new EdgeDriver();
	
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/lifecycle/steps/signup/name?ddm=0&dsh=S1696777827:1724233000777734&flowEntry=SignUp&flowName=GlifWebSignIn&TL=AKeb6mx4-0Gzyql5nZPkXR0cKKXX7FLeiAQUr_2HAVX1Fr4sT5hQPXjSdOkXUCSw");
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	
	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div/div/div/button/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("firstName")).sendKeys("Swara");
	Thread.sleep(2000);
	
	driver.findElement(By.name("lastName")).sendKeys("Shah");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();
	Thread.sleep(2000);
	
	WebElement w1=driver.findElement(By.id("month"));
	Select s1=new Select(w1);
	s1.selectByValue("2");
	Thread.sleep(2000);
	
	driver.findElement(By.name("day")).sendKeys("09");
	Thread.sleep(2000);
	
	driver.findElement(By.name("year")).sendKeys("1994");
	Thread.sleep(2000);
	
	WebElement w2=driver.findElement(By.id("gender"));
	Select s2=new Select(w2);
	s2.selectByValue("2");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"birthdaygenderNext\"]/div/button/span")).click();
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[1]/div/div[3]/div/div")).click();
//	Thread.sleep(2000);
	
	driver.findElement(By.name("Username")).sendKeys("swarashah27112022");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"next\"]/div/button/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("Passwd")).sendKeys("Utsavshah@09");
	Thread.sleep(2000);
	
	driver.findElement(By.name("PasswdAgain")).sendKeys("Utsavshah@09");
	Thread.sleep(2000);
	
//	driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/div/input")).click();
//	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"createpasswordNext\"]/div/button/span")).click();
	Thread.sleep(10000);
	
	
	
//	driver.close();
//	Thread.sleep(2000);
}
}
