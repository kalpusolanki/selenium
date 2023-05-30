package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklistbox_multiselectable 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();   // index of facebook vary in real its start from 0, if we have 3 index then pls enter 2 index for click button
		Thread.sleep(1000);
		
//		 WebElement element =driver.findElement(By.xpath("//select[@id='year']"));
//		 Select sc = 
		
		System.out.println("==========first way ===========================================");
//		Select element = new Select(driver.findElement(By.xpath("")));
//		if(element.isMultiple())
//		{
//			System.out.println("ismultiselectable");
//		}
//		else
//		{
//			System.out.println("single selectable");
//		}
		System.out.println("==========2 nd way ===========================================");
		
		WebElement element =driver.findElement(By.xpath("//select[@id='year']"));
		Select se =new Select(element);
		boolean result =se.isMultiple();
		
		
		if(result)
		{
			System.out.println("ismultiselectable");
		}
		else
		{
			System.out.println("single selectable");
		}
	}
}
