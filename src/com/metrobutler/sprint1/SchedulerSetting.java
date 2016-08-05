package com.metrobutler.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SchedulerSetting {
	
	public static WebDriver driver;
	 public static WebElement element;
	 
	 
	 public SchedulerSetting(WebDriver driver)
	 {
		 SchedulerSetting.driver = driver;
	 }
	 
	 @Test
	 public static void setScehduler() throws InterruptedException
	 {
		 
		// BaseUtility.setUpBrowser();
		// driver = BaseUtility.driver;
		 
		// Login_Host.loginAsHost();  // this method will login here as a host.
		// Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[contains(text(),'MM')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'Jan')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'DD')]")).click();
		  driver.findElement(By.xpath("(//a[@href='#05'])[2]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'YYYY')]")).click();
		  driver.findElement(By.xpath("//a[contains(text(),'2017')]")).click();
		  driver.findElement(By.xpath("//label[contains(text(),'08:00 AM to 10:00 AM')]"));
		  driver.findElement(By.linkText("Save")).click();
		  
		  
		  
	 }
	

}
