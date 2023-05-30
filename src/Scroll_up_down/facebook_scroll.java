package Scroll_up_down;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_scroll 
{
public static void main(String[] args) throws Throwable
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//scroll down 1st parameter 0 and second parameter +ve
     js.executeScript("window.scrollBy(0,350)" );
	Thread.sleep(4000);
 	//scroll up 1st parameter 0 and second parameter -ve
     js.executeScript("window.scrollBy(0,-350)" );
 	Thread.sleep(4000);
   //scroll right 1st parameter +ve and second parameter 0
     js.executeScript("window.scrollBy(150,0)" );
 	Thread.sleep(4000);
   //scroll left 1st parameter -ve and second parameter 0
     js.executeScript("window.scrollBy(-150,0)" );
}
}
