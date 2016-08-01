package com.metrobutler.sprint1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test_Login_Host {
	
	
	public static WebDriver driver;
	
	@Test
	public static void testLogin() throws InterruptedException
	{
		
		BaseUtility.setUpBrowser();
		driver = BaseUtility.driver;
		Login_Host login_obj = new Login_Host(driver);
//		SignUp_Object.homePageScreen().click();
		Login_Host.loginAsHost();
		
	}
	
	
	
	

}
