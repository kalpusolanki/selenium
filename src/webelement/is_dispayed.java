package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver_method.thread_sleep;

public class is_dispayed 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed());
	
	
	
}

}
