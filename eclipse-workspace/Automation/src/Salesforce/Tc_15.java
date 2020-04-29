package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.*;
public class Tc_15 {
	public static WebDriver driver;
	public static String baseurl;
	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
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
	System.out.println("Enter the password");
	
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
				Login.click();
	
				Thread.sleep(1000);
		
	WebElement alltabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	alltabs.click();
	Thread.sleep(1000);
	
	WebElement opportunities = driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]"));
	opportunities.click();
	Thread.sleep(2000);
	
	WebElement close= driver.findElement(By.id("tryLexDialogX"));
	close.click();
	
	WebElement viewall= driver.findElement(By.xpath("//select[@id='fcf']"));
	viewall.click();
	}

}
