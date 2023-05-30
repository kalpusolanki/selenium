package action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class inspectelentthroughaction 
{
public static void main(String[] args) throws Throwable 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement l = driver.findElement(By.xpath("//*[@id=\"live-scores-link\"]"));
	Thread.sleep(4000);
	Actions act =new Actions(driver);
	act.contextClick(l).build().perform();
	Thread.sleep(4000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_UP);
	robot.keyRelease(KeyEvent.VK_UP);
	Thread.sleep(4000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
