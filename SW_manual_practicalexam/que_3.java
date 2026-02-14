package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class que_3 {
	ChromeDriver driver;
	WebDriver drivere;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		que_3 o= new que_3();
		o.launch_chorme();
		o.Senario_chrome();
		o.launch_edge();
		o.Senario_edge();
		o.Senario_firfox();
		
	}
	void launch_chorme()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}



	void launch_edge()
	{
		drivere = new EdgeDriver();
		drivere.manage().window().maximize();
		drivere.get("https://practicetestautomation.com/practice-test-login/");
	}
	
	
	
	
	void Senario_chrome() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String url=driver.getCurrentUrl();
		if(url.contains("practicetestautomation.com/logged-in-successfully/"))
		{
			System.out.println("Correct url");
		}
		else
		{
			System.out.println("wrong page");
		}
		
		String text=driver.findElement(By.tagName("body")).getText();
		
		if(text.contains("Congratulations") || text.contains("successfully logged in"))
		{
			System.out.println("Have The Text 'Congratulations' or 'successfully logged in");
		}
		else
		{
			System.out.println("No such text ");
		}
		
		if(driver.findElement(By.xpath("//a[text()='Log out']")).isDisplayed())
		{
			System.out.println("Log out button is visible");
		}
		else
		{
			System.out.println("Not Visisble");
		}
		//back to page 
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
		driver.findElement(By.id("username")).sendKeys("STU");
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		if(driver.findElement(By.id("error")).isDisplayed())
		{
			String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your username is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your username is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		
		if(driver.findElement(By.id("error")).isDisplayed())
		{
			String err = driver.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your password is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your password is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
	}	
	
	void Senario_edge() throws InterruptedException
	{
		drivere.findElement(By.id("username")).sendKeys("student");
		drivere.findElement(By.id("password")).sendKeys("Password123");
		drivere.findElement(By.id("submit")).click();
		
		String url=drivere.getCurrentUrl();
		if(url.contains("practicetestautomation.com/logged-in-successfully/"))
		{
			System.out.println("Correct url");
		}
		else
		{
			System.out.println("wrong page");
		}
		
		String text=drivere.findElement(By.tagName("body")).getText();
		
		if(text.contains("Congratulations") || text.contains("successfully logged in"))
		{
			System.out.println("Have The Text 'Congratulations' or 'successfully logged in");
		}
		else
		{
			System.out.println("No such text ");
		}
		
		if(drivere.findElement(By.xpath("//a[text()='Log out']")).isDisplayed())
		{
			System.out.println("Log out button is visible");
		}
		else
		{
			System.out.println("Not Visisble");
		}
		//back to page 
		drivere.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
		drivere.findElement(By.id("username")).sendKeys("STU");
		drivere.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		drivere.findElement(By.id("submit")).click();
		
		if(drivere.findElement(By.id("error")).isDisplayed())
		{
			String err = drivere.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your username is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your username is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
		drivere.findElement(By.id("username")).sendKeys("student");
		drivere.findElement(By.id("password")).sendKeys("Password");
		Thread.sleep(2000);
		drivere.findElement(By.id("submit")).click();
		
		
		if(drivere.findElement(By.id("error")).isDisplayed())
		{
			String err = drivere.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your password is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your password is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
	}
		
	void Senario_firfox() throws InterruptedException
	
	{
		WebDriver drivere = new FirefoxDriver();
		drivere.findElement(By.id("username")).sendKeys("student");
		drivere.findElement(By.id("password")).sendKeys("Password123");
		drivere.findElement(By.id("submit")).click();
		
		String url=drivere.getCurrentUrl();
		if(url.contains("practicetestautomation.com/logged-in-successfully/"))
		{
			System.out.println("Correct url");
		}
		else
		{
			System.out.println("wrong page");
		}
		
		String text=drivere.findElement(By.tagName("body")).getText();
		
		if(text.contains("Congratulations") || text.contains("successfully logged in"))
		{
			System.out.println("Have The Text 'Congratulations' or 'successfully logged in");
		}
		else
		{
			System.out.println("No such text ");
		}
		
		if(drivere.findElement(By.xpath("//a[text()='Log out']")).isDisplayed())
		{
			System.out.println("Log out button is visible");
		}
		else
		{
			System.out.println("Not Visisble");
		}
		//back to page 
		drivere.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
		drivere.findElement(By.id("username")).sendKeys("STU");
		drivere.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		drivere.findElement(By.id("submit")).click();
		
		if(drivere.findElement(By.id("error")).isDisplayed())
		{
			String err = drivere.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your username is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your username is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
		drivere.findElement(By.id("username")).sendKeys("student");
		drivere.findElement(By.id("password")).sendKeys("Password");
		Thread.sleep(2000);
		drivere.findElement(By.id("submit")).click();
		
		
		if(drivere.findElement(By.id("error")).isDisplayed())
		{
			String err = drivere.findElement(By.xpath("//div[@id='error']")).getText();
			if(err.contains("Your password is invalid!"))
			{
				System.out.println("Erro msg is Display as'Your password is invalid!'");
			}
			
		}
		else
		{
			System.out.println("no error msg");
		}
		
	}

	
	
	
		

}
