package webelement;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class attribute_value 
{
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kalpus");
	
	System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value"));
	
	
}
}
