package com.infy.IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_Test {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.amazon.in/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
				
		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("scroll (0, 2000)");
		
		WebElement Arg = driver.findElement(By.xpath("//iframe[@name='a077aa5e']"));
		driver.switchTo().frame(Arg);
				
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		driver.quit();
		System.out.println("Test pass");
	}

}
