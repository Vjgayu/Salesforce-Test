package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import Salesforce.Load_Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc_33 {
	public static WebDriver driver;
	public static String baseurl;
	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vjgay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "https://www.salesforce.com/";
		driver.get(baseurl);
	driver.manage().window().maximize();
	WebElement login =  driver.findElement(By.xpath("//img[@class='img-responsive']"));
    login.click();
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("gayatri.b@salesforce.com");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("test@123");
	//System.out.println("Enter the password");
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
	Login.click();
	WebElement alltabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	alltabs.click();
	Thread.sleep(1000);
	
	WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
	home.click();
	
}
}