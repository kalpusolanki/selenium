package popup;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import webelement.click_button;

public class addtocart 
{
private static final WebElement Electronics = null;

public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
Thread.sleep(6000);
WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
Actions action=new Actions(driver);
action.moveToElement(ele).perform();
Thread.sleep(6000);
driver.findElement(By.xpath("//div[@class='_3XS_gI']//a[3]")).click();
Thread.sleep(3000);
WebElement ele1 = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
action.moveToElement(ele1).perform();
Thread.sleep(3000);
driver.findElement(By.xpath("(//a[text()='Refrigerators'])[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[contains(text(),'SAMSUNG 189 L ')]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();

Set<String> obj = driver.getWindowHandles();
ArrayList<String> obj1=new ArrayList<String>(obj);

driver.switchTo().window(obj1.get(1));


}
}
