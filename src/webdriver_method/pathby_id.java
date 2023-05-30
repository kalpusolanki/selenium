package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pathby_id 
{
public static void main(String[] args) 

{
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\html\\sample2.html");


	//enter UN
	driver.findElement(By.id("1234")).sendKeys("xyz");;

	//enter PW
	driver.findElement(By.id("4321")).sendKeys("kalpu");;
	
	// if id value is duplicate then it performed but if id values is same then same like tagname action ocuured
	
	
}
}
