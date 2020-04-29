package Salesforce;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebElement;

public class Tc_24 {
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
//lead is launched
	WebElement Leads= driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
	Leads.click();
	Thread.sleep(5000);
	
	WebElement close= driver.findElement(By.id("tryLexDialogX"));
	close.click(); 
	//new lead is created and displayed
	WebElement New = driver.findElement(By.xpath("//input[@name='new']"));
	New.click();
	WebElement newlead = driver.findElement(By.xpath("//h2[@class='pageDescription']"));
	newlead.click();
	Thread.sleep(2000);
	
	WebElement lastname = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
	lastname.sendKeys("ABCD");
	lastname.click();
	WebElement company = driver.findElement(By.xpath("//input[@id='lea3']"));
	company.sendKeys("ABCD");
	company.click();
	
	WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
	save.click();
	}
}