package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_2
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://mail.google.com/");
	
	Options s1= driver.manage();
	Window s2=s1.window();
	
	s2.minimize();
	
	driver.manage().window().maximize();
	
	Thread.sleep(10000);
	
	driver.navigate().to("https://aartiindustries.darwinbox.in/user/login");
	
	Thread.sleep(10000);
	driver.navigate().back();
	Thread.sleep(10000);
	driver.navigate().forward();
	Thread.sleep(10000);
	driver.navigate().refresh();
	
	
	driver.navigate().to("https://mail.google.com/");
	
	driver.close();
}
}
