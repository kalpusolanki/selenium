package handlingof_multiplewebelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	// webelements link text print
	List<WebElement> obj = driver.findElements(By.xpath("//a"));
	
	
Iterator<WebElement> obj2=obj.iterator();
	
	while(obj2.hasNext())
	{
		
		obj2.next().getText();
	System.out.println(obj2.next().getText());
	}
	
//	for(  WebElement obj1 : obj)
//	{
//		System.out.println(obj1.getText());
//	}
}
}
