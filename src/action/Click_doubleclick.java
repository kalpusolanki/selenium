package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_doubleclick 
{
public static void main(String[] args) throws InterruptedException, AWTException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement scr = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
	Actions act=new Actions(driver);
	act.doubleClick(scr).perform();
	//manually entered the value
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	
	
}
}
