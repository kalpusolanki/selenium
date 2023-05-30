package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class browser_open_and_close 
{
 public static void main(String[] args) 
 {
//	WebDriver driver =new ChromeDriver();
//	driver.get("https://mail.google.com/"); // to open url
//	// upcasting in selenium
//	
//	driver.close(); // to close current tab
//	driver.quit(); // to complete close
	
	 
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://mail.google.com/");
	// its executed but we not write it
	 
//	 
//	 WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities)
//			 If we use RemoteWebDriver then we have to mention where the Selenium Server is 
//			 located and which web browser you want to use.
//
//			 Ex: WebDriver driver = new RemoteWebDriver(new URL Desired capabilities.firefox());
//
//			 We can use RemoteWebDriver the same way we would use WebDriver locally. The primary difference is 
//			 that remote webdriver needs to be configured so that it can run your tests on a remote machine.
//
//			 WebDriver is an interface that you should be using throughout your tests. RemoteWebDriver is a concrete implementation of that interface. 
//			 In general, its always a good idea to code against interfaces wherever possible.
 }
}
