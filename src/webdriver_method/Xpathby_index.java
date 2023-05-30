package webdriver_method;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathby_index 
{
public static void main(String[] args) throws InterruptedException

{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	
	// click through textxpath
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	
	Thread.sleep(2000);
	
	// un enter through index
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xuv");
	Thread.sleep(2000);
	
	// surname enter through index
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abcd");
	Thread.sleep(2000);
	// through enter mobile numner
	
	
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8568546666");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("12345");
//	
//	// select from options
//	driver.findElement(By.xpath("html/body/div//select[@id=\"day\"])/option[3]")).click();
	
	driver.close();
	
}
}
