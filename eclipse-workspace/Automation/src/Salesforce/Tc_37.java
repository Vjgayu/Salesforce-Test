package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import Salesforce.Load_Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc_37 {
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
	//home page
	Thread.sleep(2000);
	WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
	home.click();
	WebElement date = driver.findElement(By.xpath("//a[contains(text(),'Wednesday April 29, 2020')]"));
	date.click();
	Thread.sleep(1000);
	
	WebElement picktime = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
	picktime.click();
	Thread.sleep(2000);
	WebElement combobox = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
	combobox.click();
	
	WebElement endtime = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
	endtime.click();
	
	//recurrence event
	
	WebElement recurrence = driver.findElement(By.xpath("//div[@id='head_3_ep']"));
	recurrence.click();
	Thread.sleep(2000);
	WebElement createrec = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
	createrec.click();
	WebElement freq=driver.findElement(By.xpath("//label[contains(text(),'Frequency')]"));
	freq.click();
	//start and end date displayed
	Actions action = new Actions(driver);
	WebElement startdate = driver.findElement(By.xpath("//input[@id='RecurrenceStartDateTime']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",startdate);
	action.moveToElement(startdate).click().build().perform();
	Thread.sleep(2000);
	WebElement enddate = driver.findElement(By.xpath(" //input[@id='RecurrenceEndDateOnly']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",enddate);
	action.moveToElement(enddate).click().build().perform();
	Thread.sleep(2000);
	//weekly calendar
	
	WebElement weekly = driver.findElement(By.xpath("//label[contains(text(),'Weekly')]"));
	weekly.click();
	WebElement recurrs = driver.findElement(By.xpath("/div[@id='w']//div[1]"));
	recurrs.sendKeys("1");
	recurrs.click();
	Thread.sleep(2000);
	WebElement curday = driver.findElement(By.xpath("//input[@id='8']"));
	curday.click();
	WebElement enddate1 = driver.findElement(By.xpath(" //input[@id='RecurrenceEndDateOnly']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",enddate1);
	action.moveToElement(enddate1).click().build().perform();
	Thread.sleep(2000);
	WebElement save = driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
	save.click();
	Thread.sleep(2000);
}
}
