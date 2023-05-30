package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver_method.thread_sleep;

public class click_button 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	// login button click using Xpath b text because id is dynamic
	
	//Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	
	// click on the check box of female
	driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	
	
}	

}
