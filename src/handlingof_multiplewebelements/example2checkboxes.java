package handlingof_multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2checkboxes
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Users\\kalpu\\OneDrive\\Desktop\\KALPESH VELOCITY\\Auto\\html\\checkbox.html");
	
	List<WebElement> obj = driver.findElements(By.xpath("//input[@type='checkbox']"));

for(WebElement s1:obj)
{
	s1.click();
	Thread.sleep(500);
	}
// find the sixe of webelements
System.out.println(obj.size());

for(int i=obj.size()-1;i>=0;i--)
{
	obj.get(i).click();
	Thread.sleep(500);
	}
}
}
