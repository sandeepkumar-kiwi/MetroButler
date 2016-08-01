package com.metrobutler.sprint1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test_Propertyinfo {
	
	static WebDriver driver;
	@Test
	public static void propertyTabLanding() throws InterruptedException
	{
		
		/*BaseUtility.setUpBrowser();
		driver = BaseUtility.driver;
		
		Login_Host obj1 = new Login_Host(driver);
		Login_Host.loginAsHost();
		Thread.sleep(2000);
		Propertyinfo obj  = new Propertyinfo(driver);  */
		
		Test_Login_Host.testLogin();    // 
		Thread.sleep(2000);
		driver = BaseUtility.driver;
		Propertyinfo obj  = new Propertyinfo(driver);
		
		Propertyinfo.properyInfoLanding();
	}
	

}
