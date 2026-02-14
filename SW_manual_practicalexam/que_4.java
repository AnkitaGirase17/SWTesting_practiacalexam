package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class que_4 {
ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		que_4 o=new que_4();
		o.launch();
		o.footer();
		
	}
	
	void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
	}
	void footer()
	{
		driver.findElement(By.partialLinkText("Home")).click();
		driver.findElement(By.partialLinkText("About Us")).click();
		driver.findElement(By.partialLinkText("Services")).click();
		driver.findElement(By.partialLinkText("Products")).click();
		driver.findElement(By.partialLinkText("Locations")).click();
		driver.findElement(By.partialLinkText("Forum")).click();
		driver.findElement(By.partialLinkText("Site Map")).click();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		driver.findElement(By.partialLinkText("www.parasoft.com")).click();
		
	}
	
	
}
