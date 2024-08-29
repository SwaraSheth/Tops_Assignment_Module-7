package com.assignment7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

/*
 * W.A.J. script to use different methods to manage the windows-alerts and pop ups.
 */

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	
	//Simple Alert
//	driver.findElement(By.id("alertButton")).click();
//	Thread.sleep(2000);
//	
//	Alert a1=driver.switchTo().alert();
//	System.out.println("Alert text is : "+a1.getText());
//	a1.accept();
//	Thread.sleep(2000);
	
	//Confirmation Alert
//	driver.findElement(By.id("confirmButton")).click();
//	Thread.sleep(2000);
//	
//	Alert a1=driver.switchTo().alert();
//	System.out.println("Alert text is : "+a1.getText());
//	a1.accept();
//	Thread.sleep(2000);
	
	//Prompt Alert
	driver.findElement(By.id("promtButton")).click();
	Thread.sleep(2000);
	
	Alert a1=driver.switchTo().alert();
	System.out.println("Alert text is : "+a1.getText());
	a1.sendKeys("Swara");
	Thread.sleep(2000);
	a1.accept();
	Thread.sleep(2000);
	
	driver.close();
}
}
