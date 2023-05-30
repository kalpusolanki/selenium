package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Select_india 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement a1 = driver.findElement(By.xpath("//select"));
//	Select s= new Select(a1);
//	s.selectByValue("IND");
	
	
	// using action class
	Actions act = new Actions(driver);
	act.moveToElement(a1).click().sendKeys("ind").sendKeys(Keys.ENTER).build().perform();
	
}
}
