package handlingof_multiplewebelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class notifiacation 
{
public static void main(String[] args) 
{
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver =new ChromeDriver();
	
	
}
}
