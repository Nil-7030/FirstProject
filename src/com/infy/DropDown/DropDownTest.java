package com.infy.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args)
	{
		// 1. selectByVisibleText()
		// 2. selectByIndex();
		// 3.selectByValue();
		
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.facebook.com/reg/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select (day);
		s.selectByVisibleText("18");
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sm = new Select (month);
		sm.selectByIndex(2);
		
		List<WebElement> list = sm.getOptions();
		
		int size = list.size();
		System.out.println("Size of month="+size);
		
		for (int i = 0; i<size; i++)
		{
			String text = list.get(i).getText();
			System.out.println("list of Month="+text);
		}
		
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sy = new Select (year);
		sy.selectByValue("1991");
	}

}
