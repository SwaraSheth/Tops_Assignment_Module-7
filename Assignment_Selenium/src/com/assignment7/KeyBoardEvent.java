package com.assignment7;

/*
 * W.A.J.Script To use Mouse and Keyboard event using Action class
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("http://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	Actions actions=new Actions(driver);
	
	WebElement email=driver.findElement(By.id("email"));
	
	Action a1=actions.moveToElement(email)
			.click()
			.keyDown(Keys.SHIFT)
			.sendKeys("hello")
			.keyUp(Keys.SHIFT)
			.doubleClick(email)
			.contextClick()
			.build();
	
	a1.perform();
	
	Thread.sleep(2000);
	
	driver.close();
		
}
}

