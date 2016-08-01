package com.metrobutler.sprint1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Submit;

public class Login_Host {

	public static WebDriver driver;

	public Login_Host(WebDriver driver) {
		Login_Host.driver = driver;
	}

	@Test
	public static void loginAsHost() {
		WebElement movetoLogin = driver.findElement(By.xpath("html/body/a/img"));
		movetoLogin.click();

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter your Email Address']"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		WebElement submit = driver.findElement(By.xpath("//input[@id='signin']"));

		email.sendKeys("sandeep.kumar@kiwitech.com");
		password.sendKeys("kiwi@123");
		submit.click();
	}

}
