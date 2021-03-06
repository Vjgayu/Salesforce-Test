package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.*;

public class Tc_7  {
	public static WebDriver driver;
	public static String baseurl;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vjgay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "https://www.salesforce.com/";
	driver.get(baseurl);
	driver.manage().window().maximize();
	WebElement login =  driver.findElement(By.xpath("//img[@class='img-responsive']"));
    login.click();
	Thread.sleep(2000);
	
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("gayatri.b@salesforce.com");
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("test@123");
	//System.out.println("Enter the password");
	Thread.sleep(2000);
	
	WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
	Login.click();
	Thread.sleep(2000);
	
	WebElement userNavLabel = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
	userNavLabel.click();
	
	WebElement settings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
	settings.click();
	
	WebElement personal = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
	personal.click();
	Thread.sleep(1000);
	
	WebElement loginhistory = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
	loginhistory.click();
	
	driver.quit();
	
	
	}
}
