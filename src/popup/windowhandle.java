package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	// launch browser
	System.out.println(driver.getWindowHandle());
	// close browser
	driver.close();
	// not getr string value of id after close
	System.out.println(driver.getWindowHandle());
}
}
