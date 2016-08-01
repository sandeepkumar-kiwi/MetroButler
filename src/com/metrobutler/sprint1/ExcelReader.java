package com.metrobutler.sprint1;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class ExcelReader {

	static Workbook workbook;
	static Sheet sheet;
	static HashMap<String, String> hm_expectedMessage = null;
	static WebDriver driver;

	public ExcelReader(WebDriver driver)
	{
		ExcelReader.driver = driver;
	}

	// to make connection with excel file.
	public static void connectExcel() throws BiffException, IOException {

		try {	
			workbook = Workbook.getWorkbook(new File("/Users/kiwitech/Documents/selenium/MetroButler/resourceFiles/test.xls"));	 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static Sheet getSheet(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		return sheet;

	}
	// save value in hashMap
	public static void put_HMExpectedMessage(String sheetName) {

		int rows = 0;
		String key = null;
		String value = null;
		sheet = workbook.getSheet(sheetName);
		hm_expectedMessage = new HashMap<String, String>();

		rows = sheet.getRows();
		for(int i=0; i<=rows-1; i++)
		{
			key =sheet.getCell(0, i).getContents();
			value = sheet.getCell(1, i).getContents();

			hm_expectedMessage.put(key, value);   // put value in hashMap
		}

	}


	// getting value from hashMap.
	public static String get_HMExpectedMessage(String sheetName, String key){

		put_HMExpectedMessage(sheetName);
		return hm_expectedMessage.get(key).toString();

	}


}

