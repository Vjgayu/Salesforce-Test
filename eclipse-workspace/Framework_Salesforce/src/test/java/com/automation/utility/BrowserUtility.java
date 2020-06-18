package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtility {

	public static WebDriver startApplication(WebDriver driver,String browserName, String appURL)
	{
		if(browserName.equals("Chrome"))
		{
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
driver = new ChromeDriver();	
driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		else {
		System.out.println("Incorrect browser");
}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}