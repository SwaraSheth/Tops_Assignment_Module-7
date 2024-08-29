package com.assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * W.A.J. Script To perform the radio button to select one by one in loop
 */

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
//	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();

	driver.get("https://demoqa.com/radio-button");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	for (int i = 2; i < 4; i++) {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div["+i+"]/label")).click();
		Thread.sleep(2000);
	}
	 
	driver.close();
	
}
}
