package $handling_dynamic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Govt_Economics 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.worldometers.info/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement a1 = driver.findElement(By.xpath("(//div[@id='c8']//span)[2]"));
	
	System.out.println("govtexpt-healthtoday----->"+a1.getText());
	
	WebElement a2 = driver.findElement(By.xpath("(//div[@id='c3']//span)[2]"));
	
	System.out.println("todaysbirthday----->"+a2.getText());
	
	
	
} 
}
