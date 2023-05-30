package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_move_in_ifram
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement a1 = driver.findElement(By.xpath("//div//span[@tabindex='0']"));
	
	Actions act =new Actions(driver);
	act.moveToElement(a1).clickAndHold().moveByOffset(400, 0).release().build().perform();;
	
	// there is also method by using for loop in which send keys arrow used 
}
}
