package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_sleep1 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://aartiindustries.darwinbox.in/user/login");
	
	// surround with try and catch
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.close();
}
}
