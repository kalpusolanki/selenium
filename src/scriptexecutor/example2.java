package scriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.browser.model.Bucket;

public class example2 
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://mdbootstrap.com/docs/standard/forms/input-fields/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor)driver;
//	// to enable alert popup
//	js.executeScript("alert('hello world');");
	Thread.sleep(4000);
	WebElement ele1 = driver.findElement(By.id("typeText"));
	js.executeScript("arguments[0].value='Kalpesh'",ele1);
	
	String text = js.executeScript("arguments[0].text",ele1).toString();
	System.out.println(text);
	
//	// to get innertext of the entire webpage in Selenium
//	String sText =  js.executeScript("return document.documentElement.innerText;").toString();
//	System.out.println(sText);
	
	
//	//to get the Title of our webpage
//	String sText =  js.executeScript("return document.title;").toString();
//	System.out.println(sText);
	
////to get the domain
//	String sText =  js.executeScript("return document.domain;").toString();
//	System.out.println(sText);
	
//	//to get the URL of our webpage
//	String sText =  js.executeScript("return document.URL;").toString();
//	System.out.println(sText);
	
	
	
}
}
