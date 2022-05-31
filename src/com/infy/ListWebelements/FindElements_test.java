package com.infy.ListWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElements_test {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		WebElement parent = driver.findElement(By.id("sub-menu"));
		
		Actions a = new Actions (driver);
		a.moveToElement(parent).perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++)
		{
			String text = list.get(i).getText();
			WebElement li = list.get(i);
			System.out.println(text);
			
			if(text.equalsIgnoreCase("google"))
			{
				li.click();
				break;
			}
		}
		driver.quit();
	}
}
