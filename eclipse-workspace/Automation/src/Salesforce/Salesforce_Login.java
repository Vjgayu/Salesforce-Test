package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce_Login {
	public static WebDriver driver;
	public static String baseurl;
	public static void main(String[] args) throws InterruptedException {
	driver.manage().window().maximize();
	WebElement login =  driver.findElement(By.xpath("//img[@class='img-responsive']"));
    login.click();
	WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
	username.sendKeys("gayatri.b@salesforce.com");
	username.click();
	Thread.sleep(2000);
	System.out.println("Enter the password");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("test@123");
	Thread.sleep(2000);
	WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
	Login.click();
	//WebElement remember=driver.findElement(By.xpath("//input[@id='rememberUn']"));
	//remember.click();
	//WebElement Login = driver.findElement(By.xpath("//input[@id='Login']"));
	//Login.click();
	Thread.sleep(2000);
	

}
}