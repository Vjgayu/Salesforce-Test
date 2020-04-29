package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tc_12 {
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
	WebElement alltabs = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
	alltabs.click();
	Thread.sleep(1000);
	//Accounts page displayed
		WebElement accounts = driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject accountBlock title')]"));
	accounts.click();
	Thread.sleep(2000);
	WebElement close= driver.findElement(By.id("tryLexDialogX"));
	close.click();
	
	//Navigating to edit view
    WebElement edit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
	edit.click();
	Thread.sleep(2000);
	WebElement editview = driver.findElement(By.xpath("//div[@id='00B5w00000BiFfo_filterLinks']//a[contains(text(),'Edit')]"));
	editview.click();
	}
}
