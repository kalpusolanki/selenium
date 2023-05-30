package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getselectedoption_fromsingleselectedlistbox 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();   // index of facebook vary in real its start from 0, if we have 3 index then pls enter 2 index for click button
	Thread.sleep(1000);

	System.out.println("===first way===========");
//	WebElement element=driver.findElement(By.xpath("//select[@id='year']"));
//	Select se =new Select(element);
//	WebElement result = se.getFirstSelectedOption();
//	 String result1 = result.getText();
//	 System.out.println(result1);
	 
	 System.out.println("===second way===========");
	 
	 Select se = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	 String result =se.getFirstSelectedOption().getText();
	 System.out.println(result);
}
}
