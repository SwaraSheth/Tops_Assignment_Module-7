package com.assignment7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. script to use different methods to manage the windows-alerts and pop ups.
 */

public class PopUps {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	Thread.sleep(2000);	
	
	String main_w=driver.getWindowHandle();
	System.out.println("main window : "+main_w);
	
	driver.findElement(By.id("tabButton")).click();
	
	Set<String> all_w=driver.getWindowHandles();
	//System.out.println("all window : "+all_w);
	
	Iterator<String> i1=all_w.iterator();
	while (i1.hasNext()) {
		String Child_W = (String) i1.next();
		System.out.println("Child Wondow : "+Child_W);
		
		if (!Child_W.equals(main_w)) {
			driver.switchTo().window(Child_W);
			Thread.sleep(2000);
			driver.close();
		}
	}
	
	driver.switchTo().window(main_w);
	Thread.sleep(2000);
	driver.close();
}
}
