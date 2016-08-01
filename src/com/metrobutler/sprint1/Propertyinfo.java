package com.metrobutler.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Propertyinfo {
	
	
	 static WebDriver driver;
	 
	 
	 public Propertyinfo(WebDriver driver)
	 {
		 
		 Propertyinfo.driver = driver;
	 }

	 public static void properyInfoLanding()
	 {
		 
		 WebElement propertyTab = driver.findElement(By.linkText("Property Info"));
		 propertyTab.click();
	 }
	 
	 
}
