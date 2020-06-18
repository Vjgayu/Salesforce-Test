package com.automationpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;
	public LoginPage(WebDriver IDriver) {
		this.driver=IDriver;
}
	
	@FindBy(xpath="//img[@class='img-responsive']") WebElement login;
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="pw") WebElement pass;
	
	@FindBy(xpath="//input[@id='Login']") WebElement loginButton;

	
	public void loginToSFDC(String Appusername,String Apppass) {
		login.click();
		uname.sendKeys(Appusername);
		pass.sendKeys(Apppass);
		loginButton.click();
}
	
}