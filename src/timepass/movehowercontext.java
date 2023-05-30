package timepass;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class movehowercontext
{
public static void main(String[] args) throws AWTException, InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(1000);

			
			Robot r=new Robot();
	r.mouseMove(300, 400);
	
	
	
	
	
}
}
