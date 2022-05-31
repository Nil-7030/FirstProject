package com.infy.IFrame2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptE {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.amazon.in/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		Dimension d = new Dimension(500, 600);
		driver.manage().window().setSize(d);
		
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("scroll (0, 2000)");
		
		je.executeScript("scroll (500, 2000)");
		
		je.executeScript("scroll (-500, 2000)");
		
		je.executeScript("scroll (0, -2000)");
		
		
	}

}
