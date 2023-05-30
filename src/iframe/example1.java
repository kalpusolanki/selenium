package iframe;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver Driver =new ChromeDriver();
	Driver.manage().window().maximize();
	Driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	Driver.switchTo().frame("iframeResult");   // Stringframeid  / or stringframe name
	
	Driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
	
	Driver.switchTo().parentFrame();
	Thread.sleep(2000);
	Driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
	Thread.sleep(2000);
	
	Driver.findElement(By.xpath("//span[contains(text(),'Change Theme')]")).click();
	
}
}
