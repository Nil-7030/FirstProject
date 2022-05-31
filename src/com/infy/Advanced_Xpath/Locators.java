package com.infy.Advanced_Xpath;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Locators {

	public static void main(String[] args) throws IOException
	{


		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.amazon.in/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);

		//Advanced Xpath
		// Parent to child

		WebElement textBox = driver.findElement(By.xpath("//form[1]/div[2]/div/input"));
		boolean text = textBox.isDisplayed();

		if (text == true) 
		{
			textBox.sendKeys("Fashion");
			G_ScreenShotMethod.screenshot(driver);
		}

		//self Node
		WebElement mobile = driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_1']/self::a"));
		boolean mo = mobile.isDisplayed();

		if (mo == true) 
		{
			mobile.click();
			G_ScreenShotMethod.screenshot(driver);
		}
		driver.navigate().back();
		//following node
		WebElement Customer= driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_1']/following::a[1]"));
		boolean co = Customer.isDisplayed();

		if (co == true) 
		{
			Customer.click();
			G_ScreenShotMethod.screenshot(driver);
		}

		//preceding node
		driver.navigate().back();
		WebElement BestSeller= driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_1']/preceding::a[@data-csa-c-slot-id='nav_cs_0']"));
		boolean bs = BestSeller.isDisplayed();

		if (bs == true) 
		{
			BestSeller.click();
			G_ScreenShotMethod.screenshot(driver);
		}
		driver.navigate().back();
		//following-sibling node
		WebElement fashion= driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_1']/following-sibling::a[3]"));
		boolean fs = fashion.isDisplayed();

		if (fs == true) 
		{
			fashion.click();
			G_ScreenShotMethod.screenshot(driver);
		}

		//preceding-sibling node
		WebElement BestS= driver.findElement(By.xpath("//*[@data-csa-c-slot-id='nav_cs_1']/preceding-sibling::a"));
		boolean b = BestS.isDisplayed();

		if (b == true) 
		{
			BestS.click();
			G_ScreenShotMethod.screenshot(driver);
		}
	}


}
