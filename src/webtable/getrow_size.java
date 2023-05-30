package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrow_size 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample1.html");
	
//	List<WebElement> a1 = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//	System.out.println(a1.size());
	
	System.out.println("==========2nd way============");
	int a2 = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
System.out.println(a2);
}
}
