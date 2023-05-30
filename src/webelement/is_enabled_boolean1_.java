package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_enabled_boolean1_ 
{
public static void main(String[] args)
{
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	
	boolean result =driver.findElement(By.xpath("//div[text()='Log in']")).isEnabled();
	System.out.println(result);
	if(result) 
	{
		System.out.println("enabled");
	}
	else 
	{
		System.out.println("disabled");
	}
}
}
