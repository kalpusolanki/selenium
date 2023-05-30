package scriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.switchTo().frame("iframeResult");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('fname').value='kalpesh'");
	// into disable field input
	js.executeScript("document.getElementById('lname').value='kalpesh'");
	// click button through javascript
	
	WebElement button = driver.findElement(By.xpath("/html/body/form/input[3]"));
	// alternate way to click
    js.executeScript("arguments[0].click();", button);
    
   
	
}
}
