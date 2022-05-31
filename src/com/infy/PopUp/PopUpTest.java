package com.infy.PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {
	static WebDriver driver;
	
	public static void alert() {
		driver.findElement(By.name("alert")).click();
		//Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	public static void confirmation() throws InterruptedException {
	driver.findElement(By.name("confirmation")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
	}
	public static void prompt() throws InterruptedException {
		driver.findElement(By.name("prompt")).click();
		//Thread.sleep(2000);
		 Alert p = driver.switchTo().alert();
		 String text = p.getText();
		 System.out.println(text);
		 Thread.sleep(1000);
		 p.sendKeys("ASPIRE");
		 Thread.sleep(1000);
		 p.accept();
		 
	}
	

	public static void main(String[] args) throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		System.setProperty(key, value);
		driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		alert();
		Thread.sleep(1000);
		confirmation();
		Thread.sleep(1000);
		prompt();
		driver.quit();
		

	}

}
