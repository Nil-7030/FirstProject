package com.infy.MultipleWindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Multiple_Window_Handle {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://nxtgenaiacademy.com/multiplewindows/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		driver.findElement(By.xpath("//button[@name='newbrowserwindow123']")).click();
		driver.findElement(By.xpath("//button[@name='newmessagewindow321']")).click();
		driver.findElement(By.xpath("//button[@name='newbrowsertab453']")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println("Parent "+parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println("Child ID "+ child);
		
		for (String s: child)
		{
			if(!parent.equalsIgnoreCase(s)) {
			driver.switchTo().window(s);
			driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();
		System.out.println("Test Pass");
	}
}
