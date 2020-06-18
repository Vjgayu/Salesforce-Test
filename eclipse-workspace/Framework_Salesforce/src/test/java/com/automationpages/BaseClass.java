package com.automationpages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utility.BrowserUtility;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {

//	private static final DisplayOrder OLDEST_FIRST = null;
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite 
	public void setUpSuite()
	{
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();

//		NetworkMode online = null;
//		String sPath=System.getProperty("user.dir")+"/Reports/SFDC.html";

		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/SFDC.html"));
		report=new ExtentReports();
		report.attachReporter(extent);
//		report=new ExtentReports(sPath,false,OLDEST_FIRST,online);
	}
	
	@BeforeClass
	public void setup() {
		driver=BrowserUtility.startApplication(driver, config.getBrowser(),config.getStagingURL());
	}
	
	@AfterClass
	public void tearDown() {
		BrowserUtility.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Helper.captureScreenshot(driver);
		}
		report.flush();
}
}