package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://mail.google.com/");
	
	Thread.sleep(10000);
	
	  Options s1 = driver.manage() ;
	    Window s2        = s1.window();
	    		s2.maximize();
	    		
//	Window s1 = driver.manage() ;  // cannot convert web driver option to webdriver window
//  // Window s2        = s1.window();
//    		s1.maximize();   
	
	    		driver.close();
}
}
