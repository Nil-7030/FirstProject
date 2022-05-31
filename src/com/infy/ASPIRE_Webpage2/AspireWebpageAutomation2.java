package com.infy.ASPIRE_Webpage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AspireWebpageAutomation2 {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String URL = "file:///D:/ASPIRE/HTML/HTML_Test.html";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.className("ASP_Test")).sendKeys("Aspire");
		
		driver.findElement(By.linkText("Facebook")).click();
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("hjkuyrx")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("html/body/input[2]")).sendKeys("ASPIRE");
		
		driver.findElement(By.xpath("//input")).sendKeys("123456");
		
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("123123123");
		
		driver.findElement(By.xpath("//input[@name='male']")).click();
		
		driver.findElement((By.xpath("//a[text()=\" Facebook \"]"))).click();
		
		//driver.quit();
	}

}
