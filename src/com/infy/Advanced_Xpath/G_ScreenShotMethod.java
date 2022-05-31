package com.infy.Advanced_Xpath;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class G_ScreenShotMethod
{
	public static void screenshot (WebDriver driver) throws IOException
	{
		Date d = new Date();
		TakesScreenshot s = ((TakesScreenshot)driver);
		File actual =s.getScreenshotAs(OutputType.FILE);
		String store = "D:\\Selenium\\ScreenShot_Test\\"+d.toString().replace(":", "_")+"amazon.png";
		File destination = new File (store);
		FileHandler.copy(actual, destination);
	}

}
