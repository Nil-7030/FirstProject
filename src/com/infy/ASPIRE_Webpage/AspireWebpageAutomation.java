package com.infy.ASPIRE_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AspireWebpageAutomation
{
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String URL = "file:///D:/ASPIRE/HTML/HTML_Test.html";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
//		WebElement username = driver.findElement(By.id("ASP_01"));
//		username.sendKeys("ASPIRE");
		//2nd Way
		driver.findElement(By.name("male")).click();
		
		driver.findElement(By.tagName("input")).sendKeys("ASPIRE");
		
		WebElement username = driver.findElement(By.id("ASP_02"));
		username.sendKeys("1231231234");
		
		
		
	}

}
