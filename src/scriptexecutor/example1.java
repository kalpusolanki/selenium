package scriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://mdbootstrap.com/docs/standard/forms/input-fields/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('form11').value='kalpesh'");
//	formControlDisabled
	js.executeScript("document.getElementById('formControlDisabled').value='kalpesh'");

}
}
