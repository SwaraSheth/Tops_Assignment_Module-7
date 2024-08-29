package com.assignment7;

/*
 * W.A.J.Script To use Mouse and Keyboard event using Action class
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\Selenium\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/menu/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement Main_Item_2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
	WebElement Sub_List=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
	WebElement Sub_Item1=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a"));
	
	Actions	actions=new Actions(driver);
	
	Action a1=actions.moveToElement(Main_Item_2).build();
	a1.perform();
	Thread.sleep(2000);
	
	Action a2=actions.moveToElement(Sub_List).build();
	a2.perform();
	Thread.sleep(2000);
	
	Action a3=actions.moveToElement(Sub_Item1).build();
	a3.perform();
	Thread.sleep(2000);
	
	driver.close();
	
}
}
