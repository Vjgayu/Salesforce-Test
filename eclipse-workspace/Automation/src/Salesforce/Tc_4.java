package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_4 extends Load_Page {
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
	    WebElement ForgotPassword = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		ForgotPassword.click();
		
	}
	}	