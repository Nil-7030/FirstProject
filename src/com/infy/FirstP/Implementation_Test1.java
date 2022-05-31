package com.infy.FirstP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implementation_Test1 implements Interface_Test1 {

	@Override
	public void Chrom_Launch()
	{
		System.setProperty(key, value );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);	
	}
}
