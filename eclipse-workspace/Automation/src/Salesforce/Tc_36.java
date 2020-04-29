package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import Salesforce.Load_Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Tc_36 {
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
	
	WebElement home = driver.findElement(By.xpath("//a[contains(@class,'brandPrimaryFgr')]"));
	home.click();
	
	WebElement date = driver.findElement(By.xpath("//a[contains(text(),'Wednesday April 29, 2020')]"));
	date.click();
	Thread.sleep(1000);
	
	WebElement time = driver.findElement(By.xpath(" //a[contains(text(),'8:00 PM')]"));
	time.click();
	
	WebElement combobox = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
	combobox.click();
	
	WebElement other = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
	other.click();
	
	WebElement endtime = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
	endtime.click();
	
	WebElement etime =driver.findElement(By.xpath("//div[@id='timePickerItem_42']"));
	etime.click();
	
	WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
	save.click();
	
}
}