package $handling_dynamic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class $BTCratelive
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://wazirx.com/exchange/BTC-INR");
	Thread.sleep(5000);
	

	WebElement BTC = driver.findElement(By.xpath("(//a[@id='ticker-btc']//div)[5]"));
//	Actions act =new Actions(driver);

System.out.println(BTC.getText());
}
}
