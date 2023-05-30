package handlingof_multiplewebelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class a12 
{
public static void main(String[] args) throws InterruptedException 
{   	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

	WebDriver driver =new ChromeDriver(option);
	driver.get("https://www.sbimf.com");
}
}
