package com.infy.Drag_and_Drop;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
//first change
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://demo.guru99.com/test/drag_drop.html";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		WebElement source = driver.findElement(By.xpath("(//a[contains(@class, 'button button-orange')])[2]"));
		WebElement target = driver.findElement(By.id("amt7"));
		
		WebElement target2 = driver.findElement(By.id("amt8"));
		
		Actions a= new Actions (driver);
		a.clickAndHold(source).moveToElement(target).release().build().perform();
		a.dragAndDrop(source, target2).perform();
	}

}
