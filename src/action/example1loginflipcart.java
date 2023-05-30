package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class example1loginflipcart
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	WebElement ele = driver.findElement(By.xpath("//a[text()='Login']"));
	Thread.sleep(4000);
	Actions act =new Actions(driver).moveToElement(ele);
	act.perform();
	
	
}
}
