package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_sleep 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://aartiindustries.darwinbox.in/user/login");
	
	Thread.sleep(10000);  // java.lang ka thread.sleep nam ka method hai
	
	driver.close();
}
}
