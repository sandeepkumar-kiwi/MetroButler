package com.metrobutler.sprint1;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Object {

	static WebDriver driver;
	static WebElement element;
	static Select select;
	static Actions action;


	public SignUp_Object(WebDriver driver)
	{
		SignUp_Object.driver = driver;

	}
     
	public static WebElement homePageScreen() throws InterruptedException
	{
		element=null;
		try
		{
			element =driver.findElement(By.xpath("html/body/a/img"));
		}catch(NoSuchElementException e)
		{ 
			e.printStackTrace();
		}catch(ElementNotVisibleException e)
		{ 
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement host_SignUp() 
	{
		try
		{
			element = driver.findElement(By.id("signup"));
		} catch (Exception e)
		{

		}
		return element;

	}

	public static WebElement createAnAccountIn3Step_Button()
	{

		try
		{
			element = driver.findElement(By.xpath("//div[@class='call-txt createstep-ac']"));
		}catch(Exception e)
		{

		}
		return element;
	}

	public static WebElement enterFirstName()
	{
		try
		{
			element = driver.findElement(By.xpath("//input[@id='data[Host][FirstName]']"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement enterlastname() 
	{
		try {
			element = driver.findElement(By.xpath("//input[@id='data[Host][LastName]']"));
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}


	public static WebElement dob_OpenMonthDropDown() {
		try
		{

			element = driver.findElement(By.xpath("//a[starts-with(@id,'sbSelector_')]"));


		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement dob_SelectMonth() {

		try
		{
			element = driver.findElement(By.xpath("(//a[contains(text(),'Jan')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}





	public static WebElement dob_openDayDropDown() {

		try
		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Day')]"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;

	}


	public static WebElement dob_SelectDay() {

		try
		{
			element = driver.findElement(By.linkText("01"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}







	public static WebElement dob_openYearDropDown() {

		try
		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Year')]"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;

	}



	public static WebElement dob_SelectYear() {

		try
		{
			element = driver.findElement(By.linkText("2015"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;


	}


	public static WebElement enterEmailAddress() {
		try
		{
			element = driver.findElement(By.xpath("//input[@id='email']"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}


	public static WebElement enterPassword() {

		try 
		{
			element = driver.findElement(By.xpath("//input[@id='UserPassword']"));
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;


	}

	public static WebElement confirmPassword() {

		try 
		{
			element = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}

	public static WebElement phoneNumber() {

		try
		{
			element  = driver.findElement(By.id("phone"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}


	public static WebElement selectCitizenshipDropDown(){

		try 
		{
			element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[4]"));





		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}



	public static WebElement selectcitizenship(){

		try 
		{
			element = driver.findElement(By.linkText("United States Citizen (IRS Form W-9)"));





		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("citizenship dropdown se value nhi mili");
		}
		return element;
	}


	public static WebElement  whichHotelRewardsProgramsDoYouUse()
	{
		try{
			element = driver.findElement(By.xpath("//label[@value='4']"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}




	public static WebElement howOftenYouTravel() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[6]"));
		}catch(Exception e)
		{
			e.printStackTrace();

		}
		return element;
	}




	public static WebElement select_howOftenYouTravel() {

		try 

		{
			element = driver.findElement(By.linkText("Every Week"));
		}catch(Exception e)
		{
			e.printStackTrace();

		}
		return element;
	}






	public static WebElement whatIsTheMainReasonYouTravel() {

		try 

		{
			//element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[8]"));
			
			
			element = driver.findElement(By.xpath("(//a[@class='sbToggle'])[8]"));
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			System.out.println("Main reason drop down not found");
		}
		return element;
	}



	public static WebElement select_whatIsTheMainReasonYouTravel() {

		try 

		{
			element = driver.findElement(By.linkText("I travel for work often"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}


	public static WebElement nextSignUp1stPage() {

		try 

		{
			element = driver.findElement(By.xpath("//button[@id='Submit']"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return element;
	}



	// Moving to the next ppage of the sign up




	public static WebElement setpropertyTitle() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyTitle]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("Property title element not found on 2nd page of the sign up");
		}
		return element;
	}




	public static WebElement setAddressLine1() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyAddress]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("address line one not found on 2nd page of the sign up");
		}
		return element;
	}



	public static WebElement setAddressLine2() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyAddress2]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("address line one not found on 2nd page of the sign up");
		}
		return element;
	}



	public static WebElement openCountryDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[9]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("country drop down not found");
		}
		return element;
	}


	public static WebElement selectCountry() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#1'])[5]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("country valued on 2nd page of the sign up not found");
		}
		return element;
	}



	public static WebElement openStateDropDown() {

		try 

		{
			//element = driver.findElement(By.xpath("(//a[contains(text(),' Select State/Province')]"));
			element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[10]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("state drop down on 2nd page of the sign ");
		}
		return element;
	}




	public static WebElement selectState() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#2'])[6]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("state valued on 2nd page of the sign ");
		}
		return element;
	}



	public static WebElement selectCityName() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyCityId]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("city valued on 2nd page of the sign ");
		}
		return element;
	}




	public static WebElement enterZipCode() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='txtzip']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("zip valued on 2nd page of the sign ");
		}
		return element;
	}



	public static WebElement selectPrimaryGoal() {

		try 

		{
			element = driver.findElement(By.xpath("//label[contains(text(),'Revenue Generation')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("primarty goel value on 2nd sign page not found ");
		}
		return element;
	}



	public static WebElement selectHomeType() {

		try 

		{
			element = driver.findElement(By.xpath("//label[contains(text(),'Apartment')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("Home Type value on 2nd sign page not found ");
		}
		return element;
	}



	public static WebElement nextButton_page2() {

		try 

		{
			element = driver.findElement(By.xpath("(//button[@name='Submit'])[2]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("Next button  value on 2nd sign page not found ");
		}
		return element;
	}




	// Move to the third page of the sign up


	public static WebElement openBedRoomDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Select number of bedrooms')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("BedRoom  value on 3rd Sign up page not found ");
		}
		return element;
	}




	public static WebElement selectNoOfBedRoom() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#1'])[7]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of BedRooms not found ");
		}
		return element;
	}



	public static WebElement openBedDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Select number of beds')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("BedDropDown not getting open here : Sandeep ");
		}
		return element;
	}



	public static WebElement selectBeds() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#1'])[8]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of beds not found ");
		}
		return element;
	}


	public static WebElement openTypeOfbedsDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[contains(text(),'Select Type of Bed')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("Type of drop down value not found ");
		}
		return element;
	}




	public static WebElement selectTypeOfBeds() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[contains(text(),'King')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("Type of Beds value not found ");
		}
		return element;
	}



	public static WebElement openNoOfPillowDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[contains(text(),'Select Number of Pillow')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of  pillow Dropdown not found ");
		}
		return element;
	}



	public static WebElement selectNoOfPillow() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#1'])[10]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of  pillow Dropdown not found ");
		}
		return element;
	}



	public static WebElement openBathRoomDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Select number of bathrooms')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("BathRoom drop down value not found ");
		}
		return element;
	}



	public static WebElement selectNoOfBathRoom() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#2'])[11]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of bathroom not found ");
		}
		return element;
	}



	public static WebElement openNoOfGuestDropDown() {

		try 

		{
			element = driver.findElement(By.xpath("//a[contains(text(),'Select number of guests')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of guest dropdown not found ");
		}
		return element;
	}



	public static WebElement selectNoOfGuest() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[@href='#1'])[12]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println("No. of guest value not found ");
		}
		return element;
	}




	public static WebElement guestScreeningPreferences() {

		try 

		{
			element = driver.findElement(By.id("data[property][PropertyGuestScreeningPreferences]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" guestScreeningPreferences value not found ");
		}
		return element;
	}



	public static WebElement aminitySelect() {

		try 

		{
			element = driver.findElement(By.xpath("(//label[contains(text(),'TV')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" aminity value not found ");
		}
		return element;
	}



	public static WebElement homefeatureSafetySelect() {

		try 

		{
			element = driver.findElement(By.xpath("(//label[contains(text(),'On-Site Management')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" homefeatureSafetySelect value not found ");
		}
		return element;
	}  



	public static WebElement nearestWashineMachineLocation() {

		try 

		{
			element = driver.findElement(By.name("data[property][PropertyWashingMachineLocation]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" nearestWashineMachineLocation value not found ");
		}
		return element;
	}  


	public static WebElement nearestDryermachineLocation() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyDryerLocation]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" nearestDryermachineLocation value not found ");
		}
		return element;
	}  


	public static WebElement locationOfTrash() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyTrashLocation]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" locationOfTrash value not found ");
		}
		return element;
	}  


	public static WebElement locationOfFuseBox() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='data[property][PropertyFuseLocation]']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" locationOfFuseBox value not found ");
		}
		return element;
	}  





	public static WebElement buildingEmergencyName() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='emg_contact_name']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" buildingEmergencyName value not found ");
		}
		return element;
	}  



	public static WebElement buildingEmergencyContactNumber() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='emg_contact_number']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" buildingEmergencyContactNumber value not found ");
		}
		return element;
	}  



	public static WebElement buildingEmergencyContactEmailAddress() {

		try 

		{
			element = driver.findElement(By.xpath("//input[@name='emg_contact_email']"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" buildingEmergencyContactEmailAddress value not found ");
		}
		return element;
	}  



	public static WebElement inCaseOfEmergencyDropDown_open() {

		try 

		{
			//element = driver.findElement(By.xpath("(//a[contains(text(),'Select')])[6]"));
			element = driver.findElement(By.xpath("(//a[@class='sbSelector'])[18]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" inCaseOfEmergencyDropDown_open value not found ");
		}
		return element;
	}  



	public static WebElement inCaseOfEmergencySelect() {

		try 

		{
			element = driver.findElement(By.xpath("(//a[contains(text(),'You may reach out to this contact immediately')])[1]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" inCaseOfEmergencySelect value not found ");
		}
		return element;
	}  



	public static WebElement iAgreeSelection() {

		try 

		{
			element = driver.findElement(By.xpath("//label[contains(text(),'I Agree')]"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" iAgreeSelection value not found ");
		}
		return element;
	}  




	public static WebElement doneSignUpComplete() {

		try 

		{
			element = driver.findElement(By.id("property-detail-done"));
		}catch(Exception e)
		{
			e.printStackTrace();

			System.out.println(" doneSignUpComplete value not found ");
		}
		return element;
	}  



	
	
	// set scheduler
	
	public static WebElement setSchedulerYes()
	{
		
		try
		{
			//element = driver.findElement(By.className("btn next-step final-done"));
			element = driver.findElement(By.linkText("Yes"));
			
			
		}
	 catch(Exception e)
	{
		e.printStackTrace();
	}
		return element;
	

}
	
	
	
	
	
	public static WebElement skipScheduler()
	{
		
		try
		{
			element = driver.findElement(By.name("skip"));
		}
	 catch(Exception e)
	{
		e.printStackTrace();
	}
		return element;
	

}
	
	
	
	
}






