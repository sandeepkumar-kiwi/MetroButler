package com.metrobutler.sprint1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseUtility {
	
	static String url = "http://metrobutler-qa.kiwireader.com/";
	static WebDriver driver;
	
	
	@BeforeClass 
	public static void setUpBrowser()
	{
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
