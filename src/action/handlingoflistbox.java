package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingoflistbox 
{
public static void main(String[] args) throws Exception {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();   // index of facebook vary in real its start from 0, if we have 3 index then pls enter 2 index for click button
	Thread.sleep(1000);
 WebElement a1 = driver.findElement(By.xpath("//select[@id='month']"));
 
 
 Actions act = new Actions(driver);
 
 // click the webelement through action class method
act.click(a1).perform();

// navigate using arrow up and down

//act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ENTER).perform();  // coorrect

System.out.println("================2 nd way=====================");

//for(int i=0;i<=2;i++)
//{
//	act.sendKeys(Keys.ARROW_UP).perform();
//	Thread.sleep(3000);
//	}
// act.sendKeys(Keys.ENTER).perform();


System.out.println("=================3 rd way======================");

// navigate to first option using home key
//
//act.sendKeys(Keys.HOME).perform();
//for(int i =0;i<=3;i++)
//{
//	act.sendKeys(Keys.ARROW_DOWN).perform();
//	Thread.sleep(3000);
//	}
//act.sendKeys(Keys.ENTER).perform();

System.out.println("=================4th way======================");

act.sendKeys(Keys.END).perform();
for(int i =0;i<=3;i++)
{
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(3000);
	}
act.sendKeys(Keys.ENTER).perform();






}
}
