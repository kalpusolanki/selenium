package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.bouncycastle.operator.KeyWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webelement.send_keys;

public class click_contextclick 
{
public static void main(String[] args) throws AWTException 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions act =new Actions(driver).moveToElement(ele);
	act.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
	
	
	System.out.println("===2 nd way=====");
	
//	act.moveToElement(ele).contextClick().perform();

	
	
	
}
}
