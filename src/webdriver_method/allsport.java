package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class allsport 
{
public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.allsport365.com/?#/ME/");
	
	Thread.sleep(4000);
	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[@class='hm-MainHeaderRHSLoggedOutWide_Login ']")).click();
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@class='lms-StandardLogin_Username ']")).sendKeys("kalpusolanki78");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lalitkumar@786");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[@class='lms-LoginButton ']")).click();
	Thread.sleep(4000);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
