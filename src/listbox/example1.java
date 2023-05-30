package listbox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();   // index of facebook vary in real its start from 0, if we have 3 index then pls enter 2 index for click button
	Thread.sleep(1000);
 List<WebElement> a1 = driver.findElements(By.xpath("//select[@id='month']"));
 String s1[] = {"Dec","May","Jun"};

 for(WebElement a2:a1)
 {
	 String a3=a2.getText();

	for(int i=0;i<=s1.length-1;i++)
	{
//		System.out.println(s1[i]);
	if(a3.contains(s1[i]))
	{
		System.out.println(s1[i]+" is present");
	}
	else
	{
		System.out.println(" not present");
	}
	
	}
	
	
	
	
 }
 
 
 
}
}
