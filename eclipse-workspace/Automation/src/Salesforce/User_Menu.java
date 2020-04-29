import org.openqa.
package Salesforce;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class User_Menu {
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


	}

}
