package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement scr = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[2]"));
	WebElement dsc = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));
	
//	System.out.println("====1st way==========");
	Actions act =new Actions(driver);
//	act.dragAndDrop(scr, dsc).perform();
	
	System.out.println("====2 nd way==========");
	
	act.clickAndHold(scr).moveToElement(dsc).release().perform();
	
	
			
}
}
