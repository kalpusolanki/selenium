package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send_keys 
{
public static void main(String[] args) 
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://aartiindustries.darwinbox.in/user/login");
	
	WebElement UN = driver.findElement(By.xpath("//div[contains(@title,'27th Match ')]"));
	UN.sendKeys("abc");
	
	// its just example of store into webelement
}
}
