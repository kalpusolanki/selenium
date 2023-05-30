package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected 
{
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	//radio button selected or not
	boolean result =driver.findElement(By.xpath("//label[@class='_58mt']")).isSelected();
	
	
	System.out.println(result);
	
	if(result)
	{
		System.out.println("radio button is selected");
	}
	else
	{
		System.out.println("radio button is de-selected");
	}
////This method is use to verify radio button/checkbox is selected or not.
//	Return type of isSelected function is boolean.
//	if radio button/checkbox is selected then it returns true otherwise it returns false.	
	
	
}
}
