
package Salesforce;

	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Load_Page {
		
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
		username.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("test@123");
		Thread.sleep(2000);	
		WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
		Login.click();
}
}