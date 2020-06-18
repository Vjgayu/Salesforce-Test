package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.automation.utility.BrowserUtility;
import com.automation.utility.Helper;
import com.automationpages.BaseClass;
import com.automationpages.LoginPage;

public class LoginTestPage extends BaseClass {

	@Test
	public void loginApp()
	{

		logger=report.createTest("Login to SFDC");
		
		LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
		
		logger.info("Starting Application");
		
		loginPage.loginToSFDC(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");

		Helper.captureScreenshot(driver);
	}
	
	@AfterClass
	public void tearDown() 
	{
		BrowserUtility.quitBrowser(driver);
	}
	
}
