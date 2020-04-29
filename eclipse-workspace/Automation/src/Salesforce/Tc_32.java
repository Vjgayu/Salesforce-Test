package Salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Tc_32 {
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
//contact is created
	WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
	contact.click();
	Thread.sleep(2000);
//my contact page is displayed
	WebElement close= driver.findElement(By.id("tryLexDialogX"));
	close.click();
	WebElement New = driver.findElement(By.xpath("//input[contains(@name,'new')]"));
	New.click();
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
	lastname.sendKeys("Indian");
	lastname.click();
	
	WebElement Accname = driver.findElement(By.xpath("//input[@id='con4']"));
	Accname.sendKeys("Global Media");
	Accname.click();
	
	WebElement savenew = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]"));
	savenew.click();
	System.out.println("test case fail");
	
}
}
