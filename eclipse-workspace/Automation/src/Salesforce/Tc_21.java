package Salesforce;
	
		import java.util.List;
		import Salesforce.Load_Page;
		import org.openqa.selenium.Alert;
		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	

public class Tc_21 extends Load_Page  {
	
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
	Thread.sleep(2000);
	//System.out.println("Enter the password");

	WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
	Login.click();
	Thread.sleep(2000);
	
	WebElement alltabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	alltabs.click();
	Thread.sleep(2000);
	
	WebElement Leads= driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject leadBlock title')]"));
	Leads.click();
	Thread.sleep(2000);
	
	WebElement close= driver.findElement(By.id("tryLexDialogX"));
	close.click();
	
	System.out.println("Navigating to Leads Page");
	
	
	//driver.close();



		}

}