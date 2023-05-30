package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example11 
{
public static void main(String[] args) throws Exception 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();   // index of facebook vary in real its start from 0, if we have 3 index then pls enter 2 index for click button
	Thread.sleep(1000);
 List<WebElement> a1 = driver.findElements(By.xpath("//select[@id='month']/option"));
 String s1[] = {"Jan","May","Jun"};

 for(WebElement a2:a1)
 {
	 String a3=a2.getText();
	 
	 Thread.sleep(5000);
System.out.println(a3);
	for(int i=0;i<=s1.length-1;i++)
	{    Thread.sleep(5000);
		System.out.print(s1[i]+"  ");
	if(a3.equalsIgnoreCase(s1[i]))
	{
		System.out.println(" is present");
	}
	else
	{
		System.out.println(" not present");
	}
	}	
 }	

}
}