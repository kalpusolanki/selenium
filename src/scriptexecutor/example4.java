package scriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4 
{
public static void main(String[] args) 
{
	// iframe to iframe
	WebDriver driver=new ChromeDriver();
	driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/disabled");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement a3 = driver.findElement(By.xpath("//*[@id=\"content\"]/article/section[1]/div/iframe"));
			driver.switchTo().frame(a3);
			driver.switchTo().frame("output-iframe");
			WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"html-output\"]/form/input[1]"));
			js.executeScript("arguments[0].value='kalpesh'", ele1);
			WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"html-editor\"]/div/div[2]/div[2]/div[8]"));
			//js.executeScript("document.getElementBy('').value=''")
			// remaining disable dropdown box select
			
			//pending // pending
			js.executeScript("arguments[0].click();", ele2);
			
}
}
