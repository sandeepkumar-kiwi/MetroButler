package com.metrobutler.sprint1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_SignUp_Object {


	//SignUp_Object signUp_Obj;
	static WebDriver driver;
	//static WebElement element;
	static String url = "http://metrobutler-qa.kiwireader.com/";
	//static String url = "http://metrobutler-dev.kiwireader.com/";

	ExcelReader excelReaderObj;
	static String firstName = null;
	static String lastName = null;
	static String email = null;
	static String password = null;
	static String confirmpassword = null;
	static String phoneNo = null;
	SignUp_Object signUp_Obj;

	@BeforeClass
	public void beforeSignUp() {

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		signUp_Obj = new SignUp_Object(driver);
		excelReaderObj = new ExcelReader(driver);

	}


	@Test
	public void test_SignUp() throws InterruptedException, BiffException, IOException {

		ExcelReader.connectExcel();
		firstName = ExcelReader.get_HMExpectedMessage("Sheet1", "FirstName");
		lastName = ExcelReader.get_HMExpectedMessage("Sheet1", "LastName");

		SignUp_Object.homePageScreen().click();
		SignUp_Object.host_SignUp().click();
		SignUp_Object.createAnAccountIn3Step_Button().click();


		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");



		firstName = ExcelReader.get_HMExpectedMessage("Sheet1", "FirstName");
		SignUp_Object.enterFirstName().sendKeys(firstName);


		lastName = ExcelReader.get_HMExpectedMessage("Sheet1", "LastName");
		SignUp_Object.enterlastname().sendKeys(lastName);

		//Thread.sleep(2000);


		SignUp_Object.dob_OpenMonthDropDown().click();
		SignUp_Object.dob_SelectMonth().click();

		SignUp_Object.dob_openDayDropDown().click();
		Thread.sleep(2000);
		SignUp_Object.dob_SelectDay().click();


		SignUp_Object.dob_openYearDropDown().click();
		Thread.sleep(2000);
		SignUp_Object.dob_SelectYear().click();



		email = ExcelReader.get_HMExpectedMessage("Sheet1", "EmailAddress");
		SignUp_Object.enterEmailAddress().sendKeys(email);


		password = ExcelReader.get_HMExpectedMessage("Sheet1", "Password");
		SignUp_Object.enterPassword().sendKeys(password);

		confirmpassword = ExcelReader.get_HMExpectedMessage("Sheet1", "ConfirmPassword");
		SignUp_Object.confirmPassword().sendKeys(confirmpassword);

		phoneNo =  ExcelReader.get_HMExpectedMessage("Sheet1", "PhoneNo");

		SignUp_Object.phoneNumber().click();
		SignUp_Object.phoneNumber().sendKeys(phoneNo);


		SignUp_Object.selectCitizenshipDropDown().click();
		SignUp_Object.selectcitizenship().click();


		SignUp_Object.whichHotelRewardsProgramsDoYouUse().click();

		SignUp_Object.howOftenYouTravel().click();
		Thread.sleep(2000);
		SignUp_Object.select_howOftenYouTravel().click();
		Thread.sleep(2000);
		SignUp_Object.whatIsTheMainReasonYouTravel().click();
		Thread.sleep(2000);
		SignUp_Object.select_whatIsTheMainReasonYouTravel().click();
		Thread.sleep(2000);
		SignUp_Object.nextSignUp1stPage().click();
		Thread.sleep(2000);


		//Moving to 2nd page of the sign up

		SignUp_Object.setpropertyTitle().sendKeys("Redhu property");
		SignUp_Object.setAddressLine1().sendKeys("US, Street No 2");
		SignUp_Object.setAddressLine2().sendKeys("Address 2 - US - Block 2");

		SignUp_Object.openCountryDropDown().click();
		Thread.sleep(200);
		SignUp_Object.selectCountry().click();
		Thread.sleep(4000);

		SignUp_Object.openStateDropDown().click();
		Thread.sleep(4000);
		SignUp_Object.selectState().click();
		Thread.sleep(2000);
		SignUp_Object.selectCityName().sendKeys("New York");
		SignUp_Object.enterZipCode().sendKeys("12345");



		SignUp_Object.selectPrimaryGoal().click();
		SignUp_Object.selectHomeType().click();
		SignUp_Object.nextButton_page2().click();
		Thread.sleep(2000);

		// Moving to 3rd page of the sign up

		SignUp_Object.openBedRoomDropDown().click();
		Thread.sleep(2000);

		SignUp_Object.selectNoOfBedRoom().click();
		Thread.sleep(1000);

		SignUp_Object.openBedDropDown().click();
		Thread.sleep(1000);
		SignUp_Object.selectBeds().click();
		Thread.sleep(2000);
		SignUp_Object.openTypeOfbedsDropDown().click();
		Thread.sleep(1000);
		SignUp_Object.selectTypeOfBeds().click();
		Thread.sleep(1000);


		SignUp_Object.openNoOfPillowDropDown().click();
		Thread.sleep(2000);

		SignUp_Object.selectNoOfPillow().click();

		SignUp_Object.openBathRoomDropDown().click();
		Thread.sleep(1000);
		SignUp_Object.selectNoOfBathRoom().click();
		SignUp_Object.openNoOfGuestDropDown().click();
		Thread.sleep(1000);
		SignUp_Object.selectNoOfGuest().click();


		SignUp_Object.guestScreeningPreferences().sendKeys("This is just a test text");
		SignUp_Object.aminitySelect().click();
		SignUp_Object.homefeatureSafetySelect().click();
		SignUp_Object.nearestWashineMachineLocation().sendKeys("US, Block No. 2");
		SignUp_Object.nearestDryermachineLocation().sendKeys("US, Dryer Machine");

		SignUp_Object.locationOfTrash().sendKeys("in building");
		SignUp_Object.locationOfFuseBox().sendKeys("US, In Building");

		SignUp_Object.buildingEmergencyName().sendKeys("Sandeep Redhu");
		SignUp_Object.buildingEmergencyContactNumber().click();
		SignUp_Object.buildingEmergencyContactNumber().sendKeys("8826150221");
		SignUp_Object.buildingEmergencyContactEmailAddress().sendKeys("Sandep@kiwitech.com");

		SignUp_Object.inCaseOfEmergencyDropDown_open().click();
		Thread.sleep(2000);
		SignUp_Object.inCaseOfEmergencySelect().click();  
		SignUp_Object.iAgreeSelection().click();
		Thread.sleep(3000);
		SignUp_Object.doneSignUpComplete().click();
		
		
		// scehduler setting
		
		Thread.sleep(3000);
		SignUp_Object.setSchedulerYes().click();
		Thread.sleep(3000);
		SignUp_Object.skipScheduler().click(); // - its use to skip the scheduler.
		
		
	
		
	


	}


	@AfterClass
	public void afterSignUp() {

		//driver.close();
	}

}
