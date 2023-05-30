package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_totalcellpresent 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample1.html");
 List<WebElement> size = driver.findElements(By.xpath("//td|//th"));
	System.out.println(size.size());
	
//	System.out.println("=====print all +++++++++");
//	for(WebElement a1:size)
//	{
//		String a2 = a1.getText();
//		System.out.println(a2);
//		
//	}
//	System.out.println("=====print only numeric value total count and sumit===========");
	 int count=0;
	   int sum=0;
	for(WebElement a1:size)
	{ 
		String a2 = a1.getText();
		try
		{
			int a3 = Integer.parseInt(a2);
			System.out.print("=== "+a3);
			count++;
			sum+=a3;
		}
		catch(Exception e)
		{
//			System.out.println(e);
		}
		
	
	}
	System.out.println();
	System.out.println("total count ====="+count);
	System.out.println("total sum========"+sum);
}
}
