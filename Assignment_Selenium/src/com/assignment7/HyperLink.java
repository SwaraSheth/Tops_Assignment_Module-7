package com.assignment7;

/*
 * W.A.J. Script To find the total hyperlink from this web page
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HyperLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","F:\\\\Selenium\\\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement>tr=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("no of row : "+tr.size());
		
		List<WebElement>th=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("no of col : "+th.size());
		
		for (int i =1 ; i <=tr.size(); i++) {
			for (int j = 1; j < th.size(); j++) {
				
				String data=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr["+i+"]/th["+j+"]")).getText();
				System.out.print(" | "+data);
				
			}
			System.out.println();
		}
		
		Thread.sleep(2000);
		driver.close();
	}
	
	
}

