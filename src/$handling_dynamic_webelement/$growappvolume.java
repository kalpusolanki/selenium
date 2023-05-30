package $handling_dynamic_webelement;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import popup.childbrowser_windowpopup;

public class $growappvolume
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.angelone.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[.='NO THANKS']")).click();
	WebElement target = driver.findElement(By.linkText("Trade & Invest"));
	WebElement stock = driver.findElement(By.xpath("(//a[.='Stocks'])[3]"));
	Actions act =new Actions(driver);
	act.moveToElement(target).moveToElement(stock).click().build().perform();
Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[.='ALEMBIC LTD.']")).click();
	
	WebElement ele1 = driver.findElement(By.xpath("(//div[@class='chart-renderer available']//span)[10]"));
	System.out.println(ele1.getText());
	
//	Robot r =new Robot();
//	r.key
	
}
}
