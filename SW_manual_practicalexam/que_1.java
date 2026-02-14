package com.test.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que_1 {
	
	ChromeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		que_1 o=new que_1();
		o.launch();
		o.form();
	}
	
	void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
	}
	
	void form()
	{
		driver.findElement(By.id("firstName")).sendKeys("Ankita");
		driver.findElement(By.id("lastName")).sendKeys("Girase");
		driver.findElement(By.id("userEmail")).sendKeys("ankita@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("14 Feb 2006");
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Automation");
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();

		WebElement fi=driver.findElement(By.id("uploadPicture"));
		fi.sendKeys("C:\\Users\\ankit\\OneDrive\\Pictures\\Feedback\\{2585A157-3813-4682-ABF8-292EC6AD13CF}\\Capture001.png");
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		driver.findElement(By.id("state")).click();
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
		driver.findElement(By.id("submit")).click();
		
		
	}

}
