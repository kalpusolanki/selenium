package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class htmllistbox_Ismultiselectable 
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/kalpu/OneDrive/Desktop/KALPESH%20VELOCITY/Auto/html/sample2.html");
	
	WebElement element =driver.findElement(By.xpath("//select[@id='4678']"));
	Select se =new Select(element);
	boolean  result =se.isMultiple();
	if(result)
	{
		System.out.println("ismultiselectable");
	}
	else
	{
		System.out.println("is not multiselectable");
	}
}
}
