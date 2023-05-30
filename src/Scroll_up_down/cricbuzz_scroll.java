package Scroll_up_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricbuzz_scroll
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cricbuzz.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"FooterWraper\"]/div/div/div[4]/ul/li[3]"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",ele2);
	
}
}
