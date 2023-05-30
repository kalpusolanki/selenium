package handlingof_multiplewebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3 
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/televisions/pr?sid=ckf%2Cczl&p%5B%5D=facets.brand%255B%255D%3DMi&otracker=categorytree&p%5B%5D=facets.serviceability%5B%5D%3Dtrue&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Mi");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='QvtND5 _2w_U27']")).click();;
//	WebElement s1 = driver.findElement(By.xpath("//div[@class='QvtND5 _2w_U27']"));
//	Actions action=new Actions(driver);
//	action.moveToElement(s1).perform();
//	
	
	
List<WebElement> obj = driver.findElements(By.xpath("//div[@class='_38vbm7']"));

for(WebElement obj1:obj)
{
	
obj1.click();
Thread.sleep(100);
}
for(int i= obj.size()-1;i>=0;i--)
{
	obj.get(i).click();
	Thread.sleep(100);
	}



}
}
