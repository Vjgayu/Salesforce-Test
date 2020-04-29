package Salesforce;
import org.openqa.selenium.*;
 import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.support.ui.*;
 import org.openqa.selenium.WebElement;
public class Tc_6 {
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
		
		WebElement  Profile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
		Profile.click();
		
		WebElement Edit  = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
		Edit .click();
		
		WebElement About = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		About.click();
		
		WebElement Post = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		Post.click();
		
		WebElement Link = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
		Link.click();
		
		WebElement chatterfile= driver.findElement(By.xpath("//input[@id='chatterFile']"));
		chatterfile.click();
		WebElement uploadElement=driver.findElement(By.id("uploadfile_0"));
		uploadElement.sendKeys("C:\\Users\\vjgay\\Downloads\\image001.png");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.className("send")).click();
		Thread.sleep(2000);
		
		
		}


}
