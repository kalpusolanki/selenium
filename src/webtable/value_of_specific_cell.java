package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class value_of_specific_cell 
{
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample1.html");
	
String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]//th[2]")).getText();
System.out.println(text);
}
}
