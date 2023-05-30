package webdriver_method;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_text_and_containstext
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	Thread.sleep(4000);
	// xpath by attribute
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kapusolanki");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Lalitkumar@786");
	Thread.sleep(4000);
	
	
	//xpath by contains text
	
	driver.findElement(By.xpath("//button[contains( text(),'Log')]")).click();
	
		////button[text()='Log in']
	
	// xpath by attribute
	
	
}
	
	
	
}
