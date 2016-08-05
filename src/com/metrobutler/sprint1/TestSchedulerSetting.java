package com.metrobutler.sprint1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestSchedulerSetting {
	
	public static WebDriver driver;
	@Test
	public static void testSchedulerSetting() throws InterruptedException
	{
		
		
		Test_Login_Host.testLogin();
		driver = BaseUtility.driver;
		Thread.sleep(2000);
		SchedulerSetting obj = new SchedulerSetting(driver);
		SchedulerSetting.setScehduler();
		
		
	}

}
