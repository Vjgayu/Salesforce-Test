package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.WebElement;

public class Tc_11{
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
	
		WebElement accounts = driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]"));
	accounts.click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("tryLexDialogX")).click();
	Thread.sleep(2000);
	
	//WebElement view = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	//view.click();
	WebElement viewlist = driver.findElement(By.xpath("//select[@id='fcf']"));
	viewlist.click();
	}
}
	