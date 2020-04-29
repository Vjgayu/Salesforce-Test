package Salesforce;
//import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_14 {
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
	
	WebElement reports= driver.findElement(By.xpath("//h3[contains(text(),'Reports')]"));
	reports.click();
	
	WebElement lact= driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
	lact.click();
	
	WebElement datef=driver.findElement(By.xpath("//input[@id='ext-gen20']"));
	datef.click();
	Thread.sleep(2000);
	Select dropDown1 = new Select(datef);
	dropDown1.deselectByIndex(2);
	WebElement from= driver.findElement(By.xpath(" //input[@id='ext-comp-1042']"));
	from.click();
	
	WebElement to = driver.findElement(By.xpath("//input[@id='ext-comp-1045']"));
	to.click();
	
	
}
}