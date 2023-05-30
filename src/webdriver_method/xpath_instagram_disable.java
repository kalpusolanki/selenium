
package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_instagram_disable
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kalpu");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("888885459");
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[text()='Log in']")).click();
	
	
}
}
