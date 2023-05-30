package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title
{
public static void main(String[] args) 
{ //Here, WebDriver is an interface, driver is a reference variable, 
	//FirefoxDriver() is a Constructor, new is a keyword, and new FirefoxDriver()
	//is an Object.
	WebDriver driver = new ChromeDriver();
	
	// we create the object of chromedriver class with referanceof webdriver interface having driver referance variable using new keyword
	
	driver.get("https://aartiindustries.darwinbox.in/user/login");
	
	String title=driver.getTitle();
	System.out.println(title);
}
}
