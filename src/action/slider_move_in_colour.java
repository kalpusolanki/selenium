package action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider_move_in_colour 
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	Actions act =new Actions(driver);
	Thread.sleep(4000);
	WebElement a1 = driver.findElement(By.xpath("(//div//span[@tabindex='0'])[1]"));

	

	
	act.moveToElement(a1).clickAndHold().moveByOffset(-150, 0).release().build().perform();
	Thread.sleep(4000);
	WebElement a2 = driver.findElement(By.xpath("(//div//span[@tabindex='0'])[2]"));
	act.moveToElement(a2).clickAndHold().moveByOffset(-100, 0).release().build().perform();
	Thread.sleep(4000);
	WebElement a3 = driver.findElement(By.xpath("(//div//span[@tabindex='0'])[3]"));
	act.moveToElement(a3).clickAndHold().moveByOffset(150, 0).release().build().perform();
}
}
